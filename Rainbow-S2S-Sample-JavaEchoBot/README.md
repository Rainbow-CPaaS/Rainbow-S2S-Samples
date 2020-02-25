#Rainbow-S2S-Sample-JavaEchoBot

##Introduction

This sample was written to work on linux ( ubuntu or debian )

Rainbow-S2S-Sample-JavaEchoBot is a bot that echoes every sentence starting by #

The aim of this bot is to demonstrate that we can use rainbow-s2s-starterkit-nodejs (as webhook handler and zmq to relay events to bot built in non nodejs language)

The implementation principle is already describe in [Building-application-with-Rainbow-OAS](../Building-application-with-Rainbow-OAS.md), we will only show how to execute the sample

## Setup to start the JavaEchoBot sample

if your working directory is **my_working_dir**


1 -  go to my_working_dir
> my_working_dir#

2 -   get [rainbow-s2s-starterkit-nodejs](https://github.com/Rainbow-CPaaS/Rainbow-S2S-StarterKit-NodeJS) from github 

my_working_dir#git clone https://github.com/Rainbow-CPaaS/Rainbow-S2S-StarterKit-NodeJS.git

3 -  go to Rainbow-S2S-StarterKit-NodeJS

>my_working_dir# cd Rainbow-S2S-StarterKit-NodeJS
my_working_dir/Rainbow-S2S-StarterKit-NodeJS#

4 - type npm install

>my_working_dir/Rainbow-S2S-StarterKit-NodeJS# npm install

5 - localy link starterkit

>my_working_dir/Rainbow-S2S-StarterKit-NodeJS# npm link
my_working_dir/Rainbow-S2S-StarterKit-NodeJS# cd ..
my_working_dir# 

6 -  clone [Rainbow-S2S-Samples](https://github.com/Rainbow-CPaaS/Rainbow-S2S-Samples) from github

>my_working_dir#clone https://github.com/Rainbow-CPaaS/Rainbow-S2S-Samples.git

7 -  go to java bot sample dir tools Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts

>my_working_dir# cd Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts
my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts#

8 - Generate Java client API and build the project by typing bash generate_clients_api_and_build.sh

>my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts#bash generate_clients_api_and_build.sh

java EchoBot is now ready to be used, we are going to setup the nodejs loader script

9 -  go to your working directory 

>my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot#cd ../../../

10 -  copy  Rainbow-S2S-StarterKit-NodeJS/non-nodejs-bot-loader directory in a loaction (rename the non-nodejs-bot-loader to what you want)

>cp Rainbow-S2S-StarterKit-NodeJS/non-nodejs-bot-loader **javabotloader**
my_working_dir# cd javabotloader

11 -  initialize a node working dir by typing npm init

>my_working_dir/javabotloader# npm init --yes

12 -  type npm link my_working_dir/Rainbow-S2S-StarterKit-NodeJS to make Rainbow-S2S-StarterKit-NodeJS available to javabotloader module

>my_working_dir/mybotloader# npm link my_working_dir/Rainbow-S2S-StarterKit-NodeJS

13 -  edit my_working_dir/javabotloader/config/s2sStarterkitConfig.json to fit your credentials and parameters


14 -  edit my_working_dir/javabotloader/config/bot-loader-params.json to fit your JavaEchBot loading parameters

```
[my_working_dir/javabotloader/config/bot-loader-params.json]
{
        "interpreter": "/bin/bash",
        "program": "my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/output/JavaS2SBotSample/start.sh",
	"isblocking": false,
        "args": [
        ]
}

interpreter is your bot language interpreter
program is JavaEchBot main loader
args is the arguments that you bot needs if required

```

15 -  start JavaEchBot by typing node s2s-zmq-bot-loader.js

>my_working_dir/javabotloader# node s2s-zmq-bot-loader.js

16 - connect with rainbow web client with your registered credentials on the plateform were your the bot is registered.

17 - send an IM message starting with #
