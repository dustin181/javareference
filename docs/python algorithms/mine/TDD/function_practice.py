def factorial(n):
    """returns n!"""
    return 1 if n < 2 else n * factorial(n - 1)


fact = factorial
print(fact)
print(fact(5))
map(factorial, range(11))

list1 = list(map(factorial, range(6)))
list2 = [factorial(n) for n in range(6)]
list3 = list(map(factorial, filter(lambda n: n % 2, range(6))))
list4 = [factorial(n) for n in range(6) if n % 2]

print(list1)
print(list2)
print(list3)
print(list4)

print(sum(range(100)))