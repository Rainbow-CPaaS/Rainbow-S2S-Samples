/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ale.rainbow.s2s.events;

import com.ale.rainbow.s2s.tools.JSonConfReader;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import zmq.Ctx;
import zmq.Msg;
import zmq.SocketBase;
import zmq.ZMQ;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author jouedje
 */
public class RainbowEventHandler implements Runnable {

    private JSonConfReader jsonConfReader;
    private static volatile boolean canStop = false;
    private final SubmissionPublisher<RainbowCallbackItem> publisher;
    private static final Logger logger = LogManager.getLogger(RainbowEventHandler.class);
    private JSONObject zmqSettings;
    private String confDir;

    public RainbowEventHandler(String confDir) {
        this.confDir = confDir;
        publisher = new SubmissionPublisher();
        RainbowEventHandler.canStop = false;
    }

    @Override
    public void run() {
        SocketBase recv=null;
        Long port=3000L;
        try {
            this.jsonConfReader = new JSonConfReader();
            logger.debug("Current relative path is: " + this.confDir);
            this.zmqSettings = this.jsonConfReader.getJsonContent(this.confDir + File.separator + "zmq.json");
            port = (Long)this.zmqSettings.get("port");
            logger.debug("zmq port :"+port);
            Ctx ctx = ZMQ.init(1);
            logger.debug("subscribing to zmq socket tcp://127.0.0.1:" + port + " ...");
            recv = ZMQ.socket(ctx, ZMQ.ZMQ_SUB);
            boolean rc = ZMQ.connect(recv, "tcp://127.0.0.1:" + port);
            if(rc){
            Msg event;
            Msg eventContent;
            ZMQ.setSocketOption(recv, ZMQ.ZMQ_SUBSCRIBE, "");

            JSONParser parser = new JSONParser();
            while (!RainbowEventHandler.canStop) {
                logger.debug("waiting for relayed webhook event...");
                long startMili = System.currentTimeMillis();//
                event = ZMQ.recv(recv, 0);
                eventContent = ZMQ.recv(recv, 0);
                String e = new String(event.data());
                String ec = new String(eventContent.data());
                logger.debug("webhook event relayed recieved, process it.");
                ec = ec.substring(1, ec.length() - 1);
                ec = ec.replace("\\\\", "!~!").replace("\\", "").replace("!~!", "\\");
                JSONObject json = (JSONObject) parser.parse(ec);
                RainbowCallbackItem item = new RainbowCallbackItem(e, json);
                publisher.submit(item);
            }
            logger.debug("closing zmq subscription...");
            if(recv!=null){
                ZMQ.disconnect(recv, "tcp://127.0.0.1:" + port);
                ZMQ.close(recv);
            }
            publisher.close();
            }else{
                logger.warn("cannot connect to tcp://127.0.0.1: "+ port);
            }
        } catch (ParseException ex) {
            logger.error("error", ex);
            publisher.close();
            if(recv!=null){
                ZMQ.disconnect(recv, "tcp://127.0.0.1:" + port);
                ZMQ.close(recv);
            }
        }catch(Exception ex){
            logger.error("error", ex);
            publisher.close();   
            if(recv!=null){
                ZMQ.disconnect(recv, "tcp://127.0.0.1:" + port);
                ZMQ.close(recv);
            }            
            throw ex;            
        }
        logger.debug("zmq subscription closed.");
    }

    public static void stop() {
        RainbowEventHandler.canStop = true;
    }

    public void subscribe(Flow.Subscriber<RainbowCallbackItem> subscriber) {
        publisher.subscribe(subscriber);
    }
}
