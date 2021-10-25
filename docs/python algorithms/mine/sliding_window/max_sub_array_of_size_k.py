def max_sub_array_of_size_k(k, arr):

    max = 0
    start = 0
    end = k

    for i in range(start, end):
        sum = 0
        for j in range(start, end):
            sum += arr[j]
            j += 1
        if sum > max:
            max = sum
        start += 1
        end += 1

    return max


def main():
    result = max_sub_array_of_size_k(3, [2, 1, 5, 1, 3, 2])
    print("Maximum sum was: " + str(result))

    result = max_sub_array_of_size_k(2, [2, 3, 4, 1, 5])
    print("Maximum sum was: " + str(result))


main()
