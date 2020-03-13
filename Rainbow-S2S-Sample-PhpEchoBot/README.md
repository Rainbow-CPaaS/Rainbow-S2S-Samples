#Rainbow-S2S-Sample-PhpEchoBot

##Introduction

This sample was written to work on linux ( ubuntu or debian )

Rainbow-S2S-Sample-PhpEchoBot is a bot that echoes every sentence starting by #

The aim of this bot is to demonstrate that we can use rainbow-s2s-starterkit-nodejs (as webhook handler and zmq to relay events to bot built in non nodejs language)

The implementation principle is already describe in [Building-application-with-Rainbow-OAS](../Building-application-with-Rainbow-OAS.md), we will only show how to execute the sample

## Setup to start the PhpEchoBot sample

if your working directory is **my_working_dir**

1 -  go to my_working_dir

> my_working_dir#

2 -  clone [Rainbow-S2S-Samples](https://github.com/Rainbow-CPaaS/Rainbow-S2S-Samples) from github

>my_working_dir#clone https://github.com/Rainbow-CPaaS/Rainbow-S2S-Samples.git

3 -  go to php bot sample dir Rainbow-S2S-Samples/Rainbow-S2S-Sample-PhpEchoBot

>my_working_dir# cd Rainbow-S2S-Samples/Rainbow-S2S-Sample-PhpEchoBot
my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-PhpEchoBot#

4 -  install Bot php dependencies using composer by typing composer install ( if not installed, install composer on your system )

>my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-PhpEchoBot#composer install

Php EchoBot is now ready to be used, we are going to setup the nodejs loader script

5 -  go to botloader directory (my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-PhpEchoBot/botlader)

6 - Update config/config.json with your registered user and application

7 - start PhpEchoBot by running the command below:
>my_working_dir/Rainbow-S2S-Samples/Rainbow-S2S-Sample-PhpEchoBot/botlader# node s2s-zmq-bot-loader.js

8 - connect with rainbow web client with your registered credentials on the plateform were your the bot is registered.

9 - send an IM message starting with #
