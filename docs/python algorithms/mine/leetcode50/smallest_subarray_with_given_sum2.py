import math


def smallest_subarray_with_given_sum(s, arr):
    window_sum = 0
    min_length = math.inf
    left = 0

    for right in range(len(arr)):
        window_sum += arr[right]

        while window_sum >= s:
            min_length = min(right - left + 1, min_length)
            window_sum -= arr[left]
            left += 1

    if min_length == math.inf:
        return 0
    return min_length










print("Smallest subarray length: " + str(smallest_subarray_with_given_sum(7, [2, 1, 5, 2, 3, 2])))
print("Smallest subarray length: " + str(smallest_subarray_with_given_sum(7, [2, 1, 5, 2, 8])))
print("Smallest subarray length: " + str(smallest_subarray_with_given_sum(8, [3, 4, 1, 1, 6])))


