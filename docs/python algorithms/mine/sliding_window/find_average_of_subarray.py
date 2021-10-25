def find_averages_of_subarrays(K, arr):
    result = []
    start = 0
    end = len(arr) - K + 1
    for i in range(start, end):
        sum = 0

        for j in range(start, end):
            sum += arr[j]
            j += 1

        result.append(sum/K)

        start += 1
        end += 1

    return result


def main():
    result = find_averages_of_subarrays(5, [1, 3, 2, 6, -1, 4, 1, 8, 2])
    print("Averages of subarrays of size K: " + str(result))


main()
