from typing import List


def twoSum(nums: List[int], target: int) -> List[int]:
    n = len(nums)
    i = 0

    numTracker = {}
    while i < n:

        if target - nums[i] in numTracker:
            return [numTracker.get(target - nums[i]), i]
        else:
            numTracker[nums[i]] = i
        i += 1


print(twoSum([2,7,11,15], 9))
print(twoSum([2,7,11,15], 26))
print(twoSum([3,2,4], 6))
print(twoSum([3,2,3], 6))