from car import Car
from account import Account
from uberX import UberX
from user import User
if __name__ == "__main__":
    print("hola mundo")
    car = Car("AMS234", Account(12,"Adres Herrera", "ANDA876", "",""))
    # print(vars(car))
    # print(vars(car.driver))

    uberX = UberX("AMDA132", Account(121,"Andrea Ferran","ANDA13123","",""), "Chevrolet", "Spark" )
    # print(vars(car))
    print(vars(uberX.driver))

    user = User(222, "eduardo", "Murj87", "eduardo@gmail.com", "hola13")
    print(vars(user))
