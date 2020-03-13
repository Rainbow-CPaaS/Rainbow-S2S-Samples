<?php
require(dirname(__FILE__).'/../vendor/autoload.php');

use Ale\Rainbow\S2S\Webhook\RainbowEventConnector;

$_ARG = array();
$callback_url = '';
foreach ($argv as $arg) {
  if (preg_match('/--([^=]+)=(.*)/',$arg,$reg)) {
    $_ARG[$reg[1]] = $reg[2];
  } elseif(preg_match('/(.*)/',$arg,$reg)) {
        $callback_url=$reg[1];
  }
}
Settings::init($_ARG['config']);
$eventConnector = new RainbowEventConnector();
$echoBotInstance = new EchoBot($callback_url);
$eventConnector->subscribe($echoBotInstance);
$echoBotInstance->start();
$eventConnector->start(); // bloquant
$echoBotInstance->stop();
$eventConnector->closeEventConnector();
