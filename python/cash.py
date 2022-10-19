from payment import Payment

class Cash(Payment):
    email = str
    def __init__(self, id, email) -> None:
        super().__init__(id)
        self.email = email