# Rainbow S2S startert kit Bot

Sample bot using Rainbow-S2S-StarterKit-NodeJS. 
This bot gives region, capital and population of a requested country using chat message.
The aim of the sample is to show how to subscribe to Rainbow Server events and how  to use Rainbow S2S dev kit.

# How to use the starter kit.

1. Clone Rainbow-S2S-StarterKit-NodeJS :<br>
 git clone https://github.com/Rainbow-CPaaS/Rainbow-S2S-StarterKit-NodeJS.git

2. Go to Rainbow-S2S-StarterKit-NodeJS directory

3. Install dependencies by typing :<br/> npm install

4. Create a local link by typing : <br/> npm link

5. Clone the Rainbow-S2S-Sample-CountryBot repository :<br>
git clone https://github.com/Rainbow-CPaaS/Rainbow-S2S-Samples/Rainbow-S2S-Sample-CountryBot.git

6. Go to Rainbow-S2S-Sample-CountryBot directory

7. Install node dependencies by typing :<br>
npm link

8. make a local link of **Rainbow-S2S-StarterKit-NodeJS** so the module can be required by your sample :
While your still in your sampel project base dir, call the command bellow:<br>
npm link \<full_path_to_Rainbow-S2S-StarterKit-NodeJS/\>

9. Start the sample : npm run bot.
