from typing import List


def threeSumSmaller(nums: List[int], target: int) -> int:
    nums.sort()
    count = 0
    for k in range(len(nums)):
        left, right = 0, k - 1
        while left < right:
            if nums[left] + nums[right] + nums[k] < target:
                count += right - left
                left += 1
            else:
                right -= 1
    return count


input1 = [-1, 0, 2, 3]
target1 = 3
# Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]
input2 = [-1, 4, 2, 1, 3]
target2 = 5
# Explanation: There are four triplets whose sum is less than the target:
#    [-1, 1, 4], [-1, 1, 3], [-1, 1, 2], [-1, 2, 3]

print(threeSumSmaller(input1, target1))
print(threeSumSmaller(input2, target2))