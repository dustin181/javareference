def square(x):
    return x * x

def numberToStates(x):
    states = {4: "Delaware", 16: "Nevada"}
    if x in states:
        return states[x]
    else:
        return "not found"


myList = [2,3,4,5]
myList2 = [square(x) for x in myList]
myList3 = [numberToStates(x) for x in myList2]
print(myList)
print(myList2)
print(myList3)

ranks = [str(n) for n in range(2, 11)] + list('JQKA')
suits = 'spades diamonds clubs hearts'.split()
print(ranks)
print(suits)

from random import choice
print(choice(ranks))
print(choice(suits))
