from typing import List


def threeSum(nums: List[int]) -> List[List[int]]:
    res = []
    nums.sort()

    for i in range(len(nums)):
        if nums[i] > 0:
            break
        if nums == 0 or nums[i] != nums[i - 1]:
            twoSumII(nums, i, res)

    return res


def twoSumII(nums: List[int], i: int, res: List[List[int]]):
    left, right = i + 1, len(nums) - 1

    while left < right:
        triplet = nums[i] + nums[left] + nums[right]

        if triplet < 0:
            left += 1
        elif triplet > 0:
            right -= 1
        else:
            res.append([nums[i], nums[left], nums[right]])
            left += 1
            right -= 1

            while left < right and nums[left] == nums[left - 1]:
                left += 1


input1 = [-1,0,1,2,-1,-4]
input2 = [0,0,0]

print(threeSum(input1))
print(threeSum(input2))