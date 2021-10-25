from money import Money


class Portfolio:
    def __init__(self):
        self.moneys = []
        self.exchangeRatesToUSD = {"USD": 1, "EUR": 1.2, "KRW": 1 / 1100}
        self.exchangeRatesFromUSD = {"EUR": 1/1.2, "KRW": 1100}

    def add(self, *moneys):
        self.moneys.extend(moneys)

    def convertFromUSD(self, moneyList):

        if moneyList.currency in self.exchangeRatesFromUSD:
            return Money(moneyList.amount * self.exchangeRatesFromUSD.get(moneyList.currency), moneyList.currency)

    def convertToUSD(self, moneyList):

        if moneyList.currency in self.exchangeRatesToUSD:
            return Money(moneyList.amount * self.exchangeRatesToUSD.get(moneyList.currency), "USD")

    def evaluate(self, currency):
        convertedList = list(map(self.convertToUSD, self.moneys))
        if currency != "USD":
            convertedList = [Money(x.amount, currency) for x in convertedList]
            convertedList = list(map(self.convertFromUSD, convertedList))
        ans = 0
        for x in convertedList:
            ans += x.amount

        return Money(ans, currency)
