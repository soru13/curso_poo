<?php
    require_once('car.php');
    class UberVan extends Car {
        public $typeCarAccepted;     
        public $material;  

        public function __construct($license, $driver, $typeCarAccepted, $material) {
            parent::__construct($license,$driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->material = $material;
        }
    }
    public function setPassenger($passenger) {
        if ($passenger == 6) {
            $this->passenger = $passenger;
        }
        else {
            echo "Necesitas asignar 6 pasajeros 
    ";
        }
    
    }
?>