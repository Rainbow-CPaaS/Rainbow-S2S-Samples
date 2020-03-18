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

    start(s2sStarterKit) {
        let that = this;
        this.s2sStarterKit = s2sStarterKit;
        this.logger = this.s2sStarterKit.logger;
        that.logger.info(that, "start ...");


        this.s2sStarterKit.events.on('rainbow_onmessagereceived', (data) => {
            that.logger.info(that, 'CountryBot : rainbow_onmessagereceived : ' + JSON.stringify(data));
	    var p=/^#/;
	    if(p.test(data.message.body)){
              that.s2sStarterKit.ImService.sendMessage(data.message.conversation_id, `Please wait I am looking for information for about ${data.message.body}`, 'en', '', '');
              that.processMessage(data);
	    }
        });

        this.s2sStarterKit.events.on('rainbow_onchatstate', (data) => {
            that.logger.info(that, 'test : rainbow_onchatstate : ' + JSON.stringify(data));
            if (!that.botInfoSent) {
                that.sendBotInfo(data.chatstate.conversation_id);
            }
        });


        /*
         Fired when the connection with rainbow is created (not yet sign-in)
        */
        this.s2sStarterKit.events.on('rainbow_onconnectioncreated', (data) => {
            console.log('S2sStarterkit : rainbow_onconnectioncreated : ' + JSON.stringify(data));
        });


        /*
         Fired when the connection can't be done with Rainbow (ie. issue on sign-in) 
        */
        this.s2sStarterKit.events.on('rainbow_onconnectionerror', (data) => {
            console.log('S2sStarterkit : rainbow_onconnectionerror : ' + JSON.stringify(data));
        });
        /*
         When a moderator changes the name of a bubble, this event is fired to all the members of the bubble (including the one who did the change) 
        */
        this.s2sStarterKit.events.on('rainbow_onbubblenamechanged', (data) => {
            console.log('S2sStarterkit : rainbow_onbubblenamechanged : ' + JSON.stringify(data));
        });
        /*
         Fired when a user changes the user connected affiliation with a bubble 
        */
        this.s2sStarterKit.events.on('rainbow_onbubbleownaffiliationchanged', (data) => {
            console.log('S2sStarterkit : rainbow_onbubbleownaffiliationchanged : ' + JSON.stringify(data));
        });
        /*
         Fired when the message has been read by the recipient 
        */
        this.s2sStarterKit.events.on('rainbow_onmessagereceiptreadreceived', (data) => {
            console.log('S2sStarterkit : rainbow_onmessagereceiptreadreceived : ' + JSON.stringify(data));
        });
        /*
         Fired when the message has been received by the server 
        */
        this.s2sStarterKit.events.on('rainbow_onmessageserverreceiptreceived', (data) => {
            console.log('S2sStarterkit : rainbow_onmessageserverreceiptreceived : ' + JSON.stringify(data));
        });
        /*
         When a moderator changes the topic data of a bubble, this event is fired to all the members of the bubble (including the one who did the change) 
        */
        this.s2sStarterKit.events.on('rainbow_onbubbletopicchanged', (data) => {
            console.log('S2sStarterkit : rainbow_onbubbletopicchanged : ' + JSON.stringify(data));
        });
        /*
         Fired when S2S starterkit is connected to Rainbow and ready to be used 
        */
        this.s2sStarterKit.events.on('rainbow_onready', (data) => {
            console.log('S2sStarterkit : rainbow_onready : ' + JSON.stringify(data));
        });
        /*
         Fired when the SDK tries to reconnect 
        */
        this.s2sStarterKit.events.on('rainbow_onreconnecting', (data) => {
            console.log('S2sStarterkit : rainbow_onreconnecting : ' + JSON.stringify(data));
        });
        /*
         Fired when the S2S starterkit has successfully started (not yet signed in) 
        */
        this.s2sStarterKit.events.on('rainbow_onstarted', (data) => {
            console.log('S2sStarterkit : rainbow_onstarted : ' + JSON.stringify(data));
        });
        /*
         Fired when a one-to-one message is received 
        */
        this.s2sStarterKit.events.on('rainbow_onmessagereceived', (data) => {
            console.log('S2sStarterkit : rainbow_onmessagereceived : ' + JSON.stringify(data));
        });
        /*
         Fired when the message has been received by the recipient 
        */
        this.s2sStarterKit.events.on('rainbow_onmessagereceiptreceived', (data) => {
            console.log('S2sStarterkit : rainbow_onmessagereceiptreceived : ' + JSON.stringify(data));
        });
        /*
         Fired when a receipt notification occurs 
        */
        this.s2sStarterKit.events.on('rainbow_onreceipt', (data) => {
            console.log('S2sStarterkit : rainbow_onreceipt : ' + JSON.stringify(data));
        });
        /*
          Fired when something goes wrong (ie: bad 'configurations' parameter, impossible to connect or reconnect, etc...) 
        */
        this.s2sStarterKit.events.on('rainbow_onerror', (data) => {
            console.log('S2sStarterkit : rainbow_onerror : ' + JSON.stringify(data));
        });
        /*
         Fired when an invitation to join a bubble is received 
        */
        this.s2sStarterKit.events.on('rainbow_onbubbleinvitationreceived', (data) => {
            console.log('S2sStarterkit : rainbow_onbubbleinvitationreceived : ' + JSON.stringify(data));
        });

        /*
         Fired when the connection is successfull with Rainbow (signin complete) 
        */
        this.s2sStarterKit.events.on('rainbow_onconnected', (data) => {
            console.log('S2sStarterkit : rainbow_onconnected : ' + JSON.stringify(data));
        });

        /*
         Fired when the connection has stopped
        */
        this.s2sStarterKit.events.on('rainbow_onstopped', (data) => {
            console.log('S2sStarterkit : rainbow_onstopped : ' + JSON.stringify(data));
        });

        /*
         Fired when a user changes his affiliation with a bubble 
        */
        this.s2sStarterKit.events.on('rainbow_onbubbleaffiliationchanged', (data) => {
            console.log('S2sStarterkit : rainbow_onbubbleaffiliationchanged : ' + JSON.stringify(data));
        });
        /*
         Fired when a conversation is deleted 
        */
        this.s2sStarterKit.events.on('rainbow_onconversationremoved', (data) => {
            console.log('S2sStarterkit : rainbow_onconversationremoved : ' + JSON.stringify(data));
        });
        /*
         fired when the presence of the connected user changes 
        */
        this.s2sStarterKit.events.on('rainbow_onpresencechanged', (data) => {
            console.log('S2sStarterkit : rainbow_onpresencechanged : ' + JSON.stringify(data));
        });
        /*
         Fired when the S2S starterkit lost the connection with Rainbow 
        */
        this.s2sStarterKit.events.on('rainbow_ondisconnected', (data) => {
            console.log('S2sStarterkit : rainbow_ondisconnected : ' + JSON.stringify(data));
        });

        /*
         Fired when a change accurs in a conversation 
        */
        this.s2sStarterKit.events.on('rainbow_onconversationchanged', (data) => {
            console.log('S2sStarterkit : rainbow_onconversationchanged : ' + JSON.stringify(data));
        });
        /*
         Fired when a bubble presence changes. It is also raised when a bubble changes isActive from true to false (and reverse) 
        */
        this.s2sStarterKit.events.on('rainbow_onbubblepresencechanged', (data) => {
            console.log('S2sStarterkit : rainbow_onbubblepresencechanged : ' + JSON.stringify(data));
        });
        /*
         When a moderator changes the custom data of a bubble, this event is fired to all the members of the bubble (including the one who did the change) 
        */
        this.s2sStarterKit.events.on('rainbow_onbubblecustomdatachanged', (data) => {
            console.log('S2sStarterkit : rainbow_onbubblecustomdatachanged : ' + JSON.stringify(data));
        });
        /*
         Fired when the SDK didn't succeed to reconnect and stop trying 
        */
        this.s2sStarterKit.events.on('rainbow_onfailed', (data) => {
            console.log('S2sStarterkit : rainbow_onfailed : ' + JSON.stringify(data));
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
        let res = await that.s2sStarterKit.ImService.sendMessage(convId, msg, lang, { "type": "text/markdown", "message": markdon }, title);
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
	countryName = countryName.substr(1);
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
            { p: ["Hello I'm Country Bot, a bot using S2S API.", "I can give you information about capital, region, population  of any country", "Please enter the name of a country prefixed by # (for example #France)."] },
            //{ p: "I can give you information about capital, region, population  of any country" },
            //{ p: "Please enter the name of a country preceded by a #" }
        ]);
        that.s2sStarterKit.ImService.sendMessage(convId, markdon, 'en', '', '');
        that.botInfoSent = true;
    }
}

module.exports = new CountryBot();
