class Money:
    def __init__(self, amount, currency):
        self.amount = amount
        self.currency = currency

    def __repr__(self):
        return "amount: " + str(self.amount) + " currency: " + str(self.currency)

    def __eq__(self, other):
        return self.amount == other.amount and self.currency == other.currency

    def times(self, multiplier):
        return Money(self.amount * multiplier, self.currency)

    def divide(self, divisor):
        return Money(self.amount / divisor, self.currency)
