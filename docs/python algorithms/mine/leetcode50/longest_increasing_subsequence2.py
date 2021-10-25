from typing import List


def lengthOfLIS(nums: List[int]) -> int:
    if not nums:
        return 0

    n = len(nums)

    dp = [1] * n

    for i in range(n):
        for j in range(i):
            if nums[i] > nums[j]:
                dp[i] = max(dp[i], dp[j] + 1)

    return max(dp)














#return 3
input1 = lengthOfLIS([1, 5, 2, 7, 3])
#return 4
input2 = lengthOfLIS([13,1,3,4,8,4])

print(input1)
print(input2)
