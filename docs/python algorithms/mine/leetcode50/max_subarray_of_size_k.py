def max_sub_array_of_size_k_brute_force(k, arr):
    max_sum = 0

    for i in range(len(arr) - k + 1):
        window_sum = 0
        for j in range(i, i+k):
            window_sum += arr[j]
        max_sum = max(max_sum, window_sum)
    return


def max_sub_array_of_size_k(k, arr):
    max_sum, window_sum = 0, 0
    left = 0

    for right in range(len(arr)):
        window_sum += arr[right]  # add the next element
        # slide the window, we don't need to slide if we've not hit the required window size of 'k'
        if right >= k - 1:
            max_sum = max(max_sum, window_sum)
            window_sum -= arr[left]  # subtract the element going out
            left += 1  # slide the window ahead
    return max_sum


def main():
  print("Maximum sum of a subarray of size K: " + str(max_sub_array_of_size_k(3, [2, 1, 5, 1, 3, 2])))
  print("Maximum sum of a subarray of size K: " + str(max_sub_array_of_size_k(2, [2, 3, 4, 1, 5])))


main()