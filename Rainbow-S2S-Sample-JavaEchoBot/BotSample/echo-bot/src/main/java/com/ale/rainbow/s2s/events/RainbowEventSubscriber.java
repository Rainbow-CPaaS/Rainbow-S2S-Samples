/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ale.rainbow.s2s.events;

import java.util.concurrent.Flow.*;
import org.json.simple.JSONObject;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 *
 * @author jouedje
 * @param <T>
 */
public class RainbowEventSubscriber<T> implements Subscriber<T> {

    private final static Logger logger = LogManager.getLogger(RainbowEventSubscriber.class);
    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription s) {
        this.subscription = s;
        this.subscription.request(1);
    }

    @Override
    public void onNext(T t) {
        logger.debug(t.toString());
        RainbowCallbackItem item = (RainbowCallbackItem) t;
        switch (item.getEventEnum()) {
        case RAINBOW_ONCONNECTIONCREATED:
                logger.debug("RAINBOW_ONCONNECTIONCREATED");
                break;
        case RAINBOW_ONCONNECTIONERROR:
                logger.debug("RAINBOW_ONCONNECTIONERROR");
                break;
        case RAINBOW_ONMESSAGERECEIVED:
                logger.debug("RAINBOW_ONMESSAGERECEIVED");
                break;
        case RAINBOW_ONMESSAGESERVERRECEIPTRECEIVED:
                logger.debug("RAINBOW_ONMESSAGESERVERRECEIPTRECEIVED");
                break;
        case RAINBOW_ONMESSAGERECEIPTRECEIVED:
                logger.debug("RAINBOW_ONMESSAGERECEIPTRECEIVED");
                break;
        case RAINBOW_ONMESSAGERECEIPTREADRECEIVED:
                logger.debug("RAINBOW_ONMESSAGERECEIPTREADRECEIVED");
                break;
        case RAINBOW_ONALLMESSAGERECEIPTRECEIVED:
                logger.debug("RAINBOW_ONALLMESSAGERECEIPTRECEIVED");
                break;
        case RAINBOW_ONALLMESSAGERECEIPTSENT:
                logger.debug("RAINBOW_ONALLMESSAGERECEIPTSENT");
                break;
        case RAINBOW_ONPRESENCECHANGED:
                logger.debug("RAINBOW_ONPRESENCECHANGED");
                break;
        case RAINBOW_ONERROR:
                logger.debug("RAINBOW_ONERROR");
                break;
        case RAINBOW_ONBUBBLEREMOVED:
                logger.debug("RAINBOW_ONBUBBLEREMOVED");
                break;
        case RAINBOW_ONBUBBLEINVITATIONRECEIVED:
                logger.debug("RAINBOW_ONBUBBLEINVITATIONRECEIVED");
                break;
        case RAINBOW_ONREADY:
                logger.debug("RAINBOW_ONREADY");
                break;
        case RAINBOW_ONSTARTED:
                logger.debug("RAINBOW_ONSTARTED");
                break;
        case RAINBOW_ONCONNECTED:
                logger.debug("RAINBOW_ONCONNECTED");
                break;
        case RAINBOW_ONSTOPPED:
                logger.debug("RAINBOW_ONSTOPPED");
                break;
        case RAINBOW_ONDISCONNECTED:
                logger.debug("RAINBOW_ONDISCONNECTED");
                break;
        case RAINBOW_ONRECONNECTING:
                logger.debug("RAINBOW_ONRECONNECTING");
                break;
        case RAINBOW_ONFAILED:
                logger.debug("RAINBOW_ONFAILED");
                break;
        case RAINBOW_ONBUBBLEAFFILIATIONCHANGED:
                logger.debug("RAINBOW_ONBUBBLEAFFILIATIONCHANGED");
                break;
        case RAINBOW_ONCONVERSATIONREMOVED:
                logger.debug("RAINBOW_ONCONVERSATIONREMOVED");
                break;
        case RAINBOW_ONCONVERSATIONCREATED:
                logger.debug("RAINBOW_ONCONVERSATIONCREATED");
                break;
        case RAINBOW_ONCONVERSATIONUPDATE:
                logger.debug("RAINBOW_ONCONVERSATIONUPDATE");
                break;
        case RAINBOW_ONCHATSTATE:
                logger.debug("RAINBOW_ONCHATSTATE");
                break;
        case RAINBOW_ONRECEIPT:
                logger.debug("RAINBOW_ONRECEIPT");
                break;
            default:
        }
        subscription.request(1);
    }

    @Override
    public void onError(Throwable thrwbl) {
    }

    @Override
    public void onComplete() {
        logger.debug("onComplete");
    }

}
