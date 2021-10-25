def max_sub_array_of_size_k_brute_force(k, arr):
    max_sum = 0

    for i in range(len(arr) - k + 1):
        window_sum = 0
        for j in range(i, i + k):
            window_sum += arr[j]

        max_sum = max(window_sum, max_sum)

    return max_sum


def max_sub_array_of_size_k(k, arr):
    max_sum, window_sum = 0, 0

    left = 0

    for right in range(len(arr)):
        window_sum += arr[right]

        if right >= k - 1:
            max_sum = max(window_sum, max_sum)
            window_sum -= arr[left]
            left += 1

    return max_sum







print("Maximum sum of a subarray of size K: " + str(max_sub_array_of_size_k(3, [2, 1, 5, 1, 3, 2])))
print("Maximum sum of a subarray of size K: " + str(max_sub_array_of_size_k(2, [2, 3, 4, 1, 5])))
print("Maximum sum of a subarray of size K: " + str(max_sub_array_of_size_k_brute_force(3, [2, 1, 5, 1, 3, 2])))
print("Maximum sum of a subarray of size K: " + str(max_sub_array_of_size_k_brute_force(2, [2, 3, 4, 1, 5])))

