def search_ceiling_of_a_number(arr, key):
    n = len(arr)
    if key > arr[n-1]:
        return -1

    left = 0
    right = n - 1

    while left <= right:
        mid = (left + right) // 2

        if key < arr[mid]:
            right = mid - 1
        elif key > arr[mid]:
            left = mid + 1
        else:
            return mid

    return left



print(search_ceiling_of_a_number([4, 6, 10], 6))
print(search_ceiling_of_a_number([1, 3, 8, 10, 15], 12))
print(search_ceiling_of_a_number([4, 6, 10], 17))
print(search_ceiling_of_a_number([4, 6, 10], -1))
