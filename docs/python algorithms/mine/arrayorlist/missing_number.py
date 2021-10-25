numbers = list(range(1, 101))
numbers = numbers[0:34] + numbers[35:]
print(numbers)

n = 100
actual_sum = 0
expected_sum = n*(n+1)/2

for x in numbers:
    actual_sum += x

print(int(expected_sum - actual_sum))



