from statistics import mode
from car import Car

class UberX(Car):
    brand = str
    model = str
    def __init__(self, license, driver, brand, model) -> None:
        super().__init__(license, driver)
        self.brand = brand
        self.model = model
