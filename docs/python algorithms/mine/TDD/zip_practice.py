for i in zip([1,2,3], ['x', 'y', 'z']):
    print(i)

for i in zip([1,2,3], ['x', 'y', 'z'], ['a', 'b', 'c']):
    print(i)

x = zip([4,5,6], ['d', 'e', 'f'], ['a', 'b', 'c'])
a, b, c = zip(*x)

print(a)
print(b)
print(c)

