<?php

require_once('car.php');
require_once('uberX.php');
require_once('account.php');
require_once('uberPool.php');
require_once('uberVan.php');

$uberX = new UberX("AW456", new Account("Andres Herrera", "AMS123"), "Totoya", "Camry");
$uberVan->setPassenger(4)
$uberX->printDataCar();
$uberVan = new UberVan("TYU567", new Account("Andrea Ferran", "ANDA456"), "Totoya", "Camry");
$uberVan->setPassenger(6)
$uberVan->printDataCar();
?>