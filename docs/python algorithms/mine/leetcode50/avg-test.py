import math

mylist = [1, 2, 3, 4, 5]

product = math.prod(mylist)
print(product)

result = []

for i in range(len(mylist)):
    result.append(int(product/mylist[i]))

print(result)