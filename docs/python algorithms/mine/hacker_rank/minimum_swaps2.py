def minimumSwaps(arr):
    count = 0
    for i in range(len(arr)):
        while arr[i] != i + 1:
            count += 1
            temp = arr[i]
            arr[i] = arr[temp - 1]
            arr[temp - 1] = temp
    return count

input = [7, 1, 3, 2, 4, 5, 6]
print(minimumSwaps(input))