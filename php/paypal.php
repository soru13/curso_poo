<?php
    require('payment.php');
    class Paypal extends Payment {
        public email;
        public funtion __construct($id, $email) {
            parent::__construct($id);
            this->email = $email;
        }
    }
?>