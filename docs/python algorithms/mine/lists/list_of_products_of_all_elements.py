lst = [1, 2, 3, 4]
output = []

for i in range(0, len(lst)):
    product = lst[0:i] + lst[i+1:]
    result = 1
    for x in product:
        result = result * x
    output.append(result)

print(output)