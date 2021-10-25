import random


class Animal:
    size = "small"
    classification = {
        'species': 'mammal',
        'biome': 'temperate',
        'region': 'Minnesota'
    }
    cities = ["Minneapolis", "St. Paul", "Duluth", "Blaine"]

    @property
    def random_city_property(self):
        random_index = random.randint(0, len(self.cities) - 1)
        return self.cities[random_index]

    def random_city_function(self):
        random_index = random.randint(0, len(self.cities) - 1)
        return self.cities[random_index]


class Tiger(Animal):
    pass


animal1 = Animal()
# print(animal1.size)
# print(animal1.classification['species'])
# print(animal1.cities)
# print(animal1.random_city_function())
# print(animal1.random_city_property)

test = True
othertest = False

if test is True:
    print("it was true")

if not othertest:
    print("it was false")

x = range(6)
for n in x:
    print(n)

