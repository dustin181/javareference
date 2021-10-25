from typing import List


def threeSumClosest(nums: List[int], target: int) -> int:
    diff = float('inf')
    nums.sort()
    for i in range(len(nums)):
        lo, hi = i + 1, len(nums) - 1
        while lo < hi:
            sum = nums[i] + nums[lo] + nums[hi]
            if abs(target - sum) < abs(diff):
                diff = target - sum
            if sum < target:
                lo += 1
            else:
                hi -= 1
        if diff == 0:
            break
    return target - diff


input1 = [-1,2,1,-4]
target1 = 1

print(threeSumClosest(input1, target1))