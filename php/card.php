<?php
    require('payment.php');
    class Card extends Payment {
        public $numberCard;
        public $nameCard;
        public $cvv;
        public $expireDate;
        public funtion __construct($id, $numberCard, $nameCard, $cvv, $expireDate) {
            parent::__construct($id);
            this->numberCard = $numberCard;
            this->nameCard = $nameCard;
            this->cvv = $cvv;
            this->expireDate = $expireDate;
        }
    }
?>