from typing import List


def validMountainArray(arr: List[int]) -> bool:
    length = len(arr)

    if length < 3:
        return False

    i = 1

    while i < length and arr[i] > arr[i - 1]:
        i += 1

    if i == 1 or i == length:
        return False

    while i < length and arr[i] < arr[i-1]:
        i += 1

    return i == length


arr1 = [2,1]
arr2 = [3,5,5]
arr3 = [0,3,2,1]
arr4 = [0,2,3,4,5,2,1,0]
arr5 = [0,2,3,3,5,2,1,0]

print(validMountainArray(arr1))
print(validMountainArray(arr2))
print(validMountainArray(arr3))
print(validMountainArray(arr4))
print(validMountainArray(arr5))

