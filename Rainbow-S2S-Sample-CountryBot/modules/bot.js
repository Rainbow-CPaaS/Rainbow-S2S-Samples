"use strict";

var requestPromise = require('request-promise')
var settings = require('./../config/bot-settings')
const json2md = require('json2md')

class CountryBot {

    constructor() {
        this.s2sStarterKit = null;
        this.logger = null;
        this.botInfoSent = false;
    }

    start(s2sdevKit) {
        let that = this;
        this.s2sStarterKit = s2sdevKit;
        this.logger = this.s2sStarterKit.logger;
        that.logger.info(that, "start ...");


        this.s2sStarterKit.events.on('rainbow_onmessagereceived', (data) => {
            that.logger.info(that, 'CountryBot : rainbow_onmessagereceived : ' + JSON.stringify(data));
            that.s2sStarterKit.ImService.sendMessage(data.message.conversation_id, `Please wait I am looking for information for about ${data.message.body}`, 'en', '', '');
            that.processMessage(data);
        });

        this.s2sStarterKit.events.on('rainbow_onpresencechanged', (data) => {
            that.logger.info(that, 'test : rainbow_onpresencechanged : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_onchatstate', (data) => {
            that.logger.info(that, 'test : rainbow_onchatstate : ' + JSON.stringify(data));
            if (!that.botInfoSent) {
                that.sendBotInfo(data.chatstate.conversation_id);
            }
        });

        this.s2sStarterKit.events.on('rainbow_onstarted', (data) => {
            that.logger.info(that, 'test : rainbow_onstarted : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_onstopped', (data) => {
            that.logger.info(that, 'test : rainbow_onstopped : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_onready', (data) => {
            that.logger.info(that, 'test : rainbow_onready : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_onerror', (data) => {
            that.logger.info(that, 'test : rainbow_onerror : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_onconnected', (data) => {
            that.logger.info(that, 'test : rainbow_onconnected : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_onconnectionerror', (data) => {
            that.logger.info(that, 'test : rainbow_onconnectionerror : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_ondisconnected', (data) => {
            that.logger.info(that, 'test : rainbow_ondisconnected : ' + JSON.stringify(data));
        });

        this.s2sStarterKit.events.on('rainbow_onfailed', (data) => {
            that.logger.info(that, 'test : rainbow_onfailed : ' + JSON.stringify(data));
        });

        that.logger.exit(that, "started");
    }

    async sendMessage(convId, message, lang) {
        let that = this;
        that.logger.enter(that, `convIv :${convId}`);
        let content = '';
        let title = '';
        let cnxId = that.s2sStarterKit.connectionInfo.id;
        that.logger.info(that, `cnxId :${cnxId}`);
        let msg = that.converToTextMessage(message);
        that.logger.info(that, `msg :${msg}`);
        let markdon = that.convertToMarkDonMessage(message);
        that.logger.info(that, `markdon :${markdon}`);
        let res = await that.s2sStarterKit.ImService.sendMessage(convId,msg, lang,{"type": "text/markdown", "message": markdon}, title);
        that.logger.exit(that, res);
        return res;
    }

    async getCountryInfo(countryName) {
        let that = this;
        that.logger.enter(that, "countryName :" + countryName);
        var options = {
            uri: encodeURI(settings.country_service_url + '/' + countryName),
            /*
            qs: {
                access_token: 'xxxxx xxxxx' // -> uri + '?access_token=xxxxx%20xxxxx'
            },*/
            headers: {
                'User-Agent': 'Request-Promise'
            },
            json: true // Automatically parses the JSON string in the response
        };
        //return new Promise((resolve, reject) => {
        let res = await requestPromise(options).then((country) => {
            //that.logger.info(that, country);
            //resolve(country);
            return country;
        }).catch((err) => {
            // API call failed...
            that.logger.error(err);
            //reject(err);
            throw err;
        });
        //});
        that.logger.exit(that, res);
        return res;
    };

    converToTextMessage(message) {
        let that = this;
        that.logger.enter(that, 'converToTextMessage :message length =' + message.length);
        let msg = message[0].name + '\n' +
            'Flag :' + message[0].flag + '\n' +
            'Capital :' + message[0].capital + '\n' +
            'Region :' + message[0].region + '\n' +
            'Sub Region :' + message[0].subregion + '\n' +
            'Population :' + message[0].population + '\n';
        that.logger.exit(that, msg);
        return msg;
    }

    convertToMarkDonMessage(message) {
        let that = this;
        that.logger.enter(that, 'convertToMarkDonMessage :message length =' + message.length);
        try {
            let markdon = json2md([
                { h1: message[0].name },
                { h2: message[0].capital },
                {
                    img: [
                        { title: "Flag", source: message[0].flag }
                    ]
                },
                {
                    ul: [
                        'Capital :' + message[0].capital,
                        'Region :' + message[0].region,
                        'Sub Region :' + message[0].subregion,
                        'Population :' + message[0].population,
                    ]
                }
            ]);
            that.logger.exit(that, markdon);
            return markdon;
        } catch (ex) {
            that.logger.exit(that, ex);
        }
        return '';
    }

    async processMessage(data) {
        let that = this;
        that.logger.info(that, 'CountryBot : processMessage : ' + JSON.stringify(data));
        let messageReceived = data.message;
        that.logger.info(that, 'CountryBot : processMessage : ' + JSON.stringify(messageReceived));
        let lang = (messageReceived.lang ? messageReceived.lang : "en");
        let convId = messageReceived.conversation_id;
        let countryName = messageReceived.body;
        try {
            let message = await that.getCountryInfo(countryName);
            that.logger.info(that, 'CountryBot : processMessage : getCountryInfo :' + JSON.stringify(message));
            that.sendMessage(convId, message, lang);
        } catch (err) {
            that.logger.error(err);
            that.s2sStarterKit.ImService.sendMessage(convId, `Sorry, I do not have information about ${countryName}`, 'en', '', '');
        }
    }

    async sendBotInfo(convId) {
        let that = this;
        let markdon = json2md([
            { p: ["Hello I'm Country Bot, a bot using S2S API.", "I can give you information about capital, region, population  of any country", "Please enter the name of a country."] },
            //{ p: "I can give you information about capital, region, population  of any country" },
            //{ p: "Please enter the name of a country preceded by a #" }
        ]);
        that.s2sStarterKit.ImService.sendMessage(convId, markdon, 'en', '', '');
        that.botInfoSent = true;
    }
}

module.exports = new CountryBot();
