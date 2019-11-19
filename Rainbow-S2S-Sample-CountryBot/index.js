'use strict';

var S2SDevKit = require('rainbow-s2s-starterkit-nodejs');

const sdkConfig = require('./config/settings.json');

const myCountryBot = require('./modules/bot');

let cmdLineArgs = require('node-getopt').create([
        ['L', 'protocol=ARG', 'http protocol [http or https]'],
        ['L', 'port=ARG', 'http port'],
        ['L', 'jwt=ARG', 'json web token for authentication'],
        ['h', 'help', 'display this help'],
        ['v', 'version', 'show version']
    ]) // create Getopt instance
    .bindHelp() // bind option 'help' to default action
    .parseSystem(); // parse command line

if(cmdLineArgs.options.hasOwnProperty('protocol')){
	sdkConfig.rainbow_notification_service.sdkrouter.protocol = cmdLineArgs.options.protocol;
	sdkConfig.rainbow_notification_service.ngrok.proto = cmdLineArgs.options.protocol;
}
if(cmdLineArgs.options.hasOwnProperty('port')){
	sdkConfig.rainbow_notification_service.sdkrouter.port = cmdLineArgs.options.port;
	sdkConfig.rainbow_notification_service.ngrok.port = cmdLineArgs.options.port;
}

const myS2sDevKit = new S2SDevKit(sdkConfig);
(async() => {
    try {
        await myS2sDevKit.start().then((data) => {
            myCountryBot.start(myS2sDevKit);
        }).catch((e) => {
            console.error(e);
            myS2sDevKit.stop();
        });
    } catch (ex) {
        console.log(ex);
    }
})();
