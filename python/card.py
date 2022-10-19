from ast import Num
from payment import Payment
class Card(Payment):
    carNumber = str
    carName = str
    cvv = int
    expireDate = str
    def __init__(self, id, carNumber, carName, cvv, expireDate) -> None:
        super().__init__(id)
        self.carNumber = carNumber
        self.carName = carName
        self.cvv = cvv
        self.expireDate = expireDate