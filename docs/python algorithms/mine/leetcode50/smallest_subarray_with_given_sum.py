import math


def smallest_subarray_with_given_sum(s, arr):
    window_sum = 0
    min_length = math.inf
    left = 0

    for right in range(len(arr)):
        window_sum += arr[right]  # add the next element
        # shrink the window as small as possible until the 'window_sum' is smaller than 's'
        while window_sum >= s:
            min_length = min(min_length, right - left + 1)
            window_sum -= arr[left]
            left += 1
    if min_length == math.inf:
        return 0
    return min_length




print("Smallest subarray length: " + str(smallest_subarray_with_given_sum(7, [2, 1, 5, 2, 3, 2])))
# Output: 2
# Explanation: The smallest subarray with a sum greater than or equal to '7' is [5, 2].
print("Smallest subarray length: " + str(smallest_subarray_with_given_sum(7, [2, 1, 5, 2, 8])))
print("Smallest subarray length: " + str(smallest_subarray_with_given_sum(8, [3, 4, 1, 1, 6])))


