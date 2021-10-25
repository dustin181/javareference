class MusicalInstrument:
    def __init__(self, brand, model, year_built):
        self._brand = brand
        self._model = model
        self._year_built = year_built

    def __str__(self):
        return f"{self._year_built} " \
            + f"{self._brand} {self._model}"


class Guitar(MusicalInstrument):
    def __init__(self, brand, model, year_built, strings=6):
        super().__init__(brand, model, year_built)
        self._strings = strings

    def __str__(self):
        return f"{self._strings}-string " \
         + super().__str__()


instrument = MusicalInstrument("Gibson", "Les Paul", "1997")
print(instrument)

guitar = Guitar("Fender", "Stratocaster", "2012")
print(guitar)