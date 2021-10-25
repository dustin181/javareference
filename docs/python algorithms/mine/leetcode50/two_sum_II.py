from typing import List


def twoSum(numbers: List[int], target: int) -> List[int]:
    left, right = 0, len(numbers) - 1
    while left < right:
        if numbers[left] + numbers[right] == target:
            return [left + 1, right + 1]
        if numbers[left] + numbers[right] > target:
            right -= 1
        else:
            left += 1

    return -1


input1 = [2,7,11,15]
target1 = 9

input2 = [2,3,4]
target2 = 6

print(twoSum(input1, target1))
print(twoSum(input2, target2))
