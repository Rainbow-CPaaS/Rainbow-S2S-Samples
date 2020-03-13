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

2 -  clone [Rainbow-S2S-Samples](https://github.com/Rainbow-CPaaS/Rainbow-S2S-Samples) from github

>my_working_dir#clone https://github.com/Rainbow-CPaaS/Rainbow-S2S-Samples.git

3 -  go to java bot sample dir tools Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts

>my_working_dir# cd Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts
my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts#

4 - Generate Java client API and build the project by typing bash generate_clients_api_and_build.sh

>my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/scripts#bash generate_clients_api_and_build.sh

java EchoBot is now ready to be used, we are going start it using nodejs loader script

5 - Go into directory my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/botloader

>my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-JavaEchoBot/botloader#

6 -  edit my_working_dir/javabotloader/config/config.json to fit your registered credentials

7 -  start JavaEchBot by typing node s2s-zmq-bot-loader.js

>my_working_dir/javabotloader# node s2s-zmq-bot-loader.js

8 - connect with rainbow web client with your registered credentials on the plateform were your the bot is registered.

9 - send an IM message starting with #
