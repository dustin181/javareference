from typing import List


def threeSumClosest(nums: List[int], target: int) -> int:
    diff = float('inf')
    nums.sort()
    for i in range(len(nums)):
        left, right = i + 1, len(nums) - 1
        while left < right:
            sum = nums[i] + nums[left] + nums[right]
            if abs(target - sum) < abs(diff):
                diff = target - sum
            if sum < target:
                left += 1
            else:
                right -= 1
        if diff == 0:
            break
    return target - diff


input1 = [-2, 0, 1, 2]
target1 = 2
input2 = [-3, -1, 1, 2]
target2 = 1
input3= [1, 0, 1, 1]
target3 = 3

print(threeSumClosest(input1, target1))
print(threeSumClosest(input2, target2))
print(threeSumClosest(input3, target3))