arr = [9, 2, 3, 6]
result = arr[0]

for x in range(0, len(arr)):
    result = min(arr[x], result)

print(result)