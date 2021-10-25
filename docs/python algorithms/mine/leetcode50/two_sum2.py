from typing import List


def twoSum(nums: List[int], target: int) -> List[int]:
    n = len(nums)
    seen = {}

    for x in range(n):
        if target - nums[x] in seen:
            return [x, seen[target - nums[x]]]
        else:
            seen[nums[x]] = x


print(twoSum([2,7,11,15], 9))
print(twoSum([2,7,11,15], 26))
print(twoSum([3,2,4], 6))
print(twoSum([3,2,3], 6))