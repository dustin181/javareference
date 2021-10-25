from collections import defaultdict, Counter

dial_codes = [
    (880, 'Bangladesh'),
    (55,  'Brazil'),
    (86,  'China'),
    (91,  'India'),
    (62,  'Indonesia'),
    (81,  'Japan'),
    (234, 'Nigeria'),
    (92,  'Pakistan'),
    (7,   'Russia'),
    (1,   'United States'),
]

country_dial = {country: code for code, country in dial_codes}
print(country_dial)

# somedict = {}
# print(somedict[3]) # KeyError

someddict = defaultdict(int)
print(someddict[3]) # print int(), thus 0

from collections import defaultdict

new_defaultdict = defaultdict(int)
print(new_defaultdict[4])

numbers = [100,200,300,400,500]
students = ['Joe', 'Ronald', 'Ahmed', 'Marcelo', 'Alves']

new_dict = {x: y for (x,y) in zip(numbers, students)}
print(new_dict)

numbers = [1,5,10,15,20,25]
my_dictionary = {x: x ** 2 for x in numbers if x ** 2 % 4 == 0}
print(my_dictionary)





