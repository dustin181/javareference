def find_missing_number(numbers):
    left = numbers[0]
    right = numbers[1]

    while right < len(numbers):
        if numbers[left] != numbers[right] - 1:
            return numbers[right] - 1
        else:
            left += 1
            right += 1


numbers = list(range(1, 101))
numbers = numbers[0:34] + numbers[35:]
print(numbers)

print(find_missing_number(numbers))






