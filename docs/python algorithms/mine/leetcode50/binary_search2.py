def binarySearch(arr, target):
    left, right = 0, len(arr) - 1

    while left <= right:
        mid = (left + right) // 2

        if target == arr[mid]:
            return mid
        elif target < arr[mid]:
            right = mid - 1
        else:
            left = mid + 1

    return -1

nums = [1,5,7,9,20,30,99,234,1200,1202,1456]
target = 1200

print(binarySearch(nums, target))