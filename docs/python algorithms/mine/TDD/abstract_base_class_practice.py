from abc import ABC, abstractmethod


class MusicalInstrument(ABC):
    def __init__(self, brand, model, year_built):
        self._brand = brand
        self._model = model
        self._year_built = year_built

    @abstractmethod
    def __str__(self):
        return NotImplemented