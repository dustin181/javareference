from typing import List


def findLCIS(nums: List[int]) -> int:
    ans = anchor = 0
    for i in range(len(nums)):
        if i and nums[i-1] >= nums[i]:
            anchor = i
        ans = max(ans, i - anchor + 1)
    return ans


input1 = [1,3,5,4,7]

print(findLCIS(input1))













