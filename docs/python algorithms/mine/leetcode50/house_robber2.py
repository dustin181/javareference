from typing import List


def rob(nums: List[int]) -> int:
    n = len(nums)

    dp = [0] * n

    dp[0] = nums[0]

    for i in range(1, n):
        if i == 1:
            dp[i] = max(nums[0], nums[1])
        else:
            dp[i] = max(dp[i-1], nums[i] + dp[i-2])

    return dp[-1]


input1 = [1,2,3,1]
input2 = [2,7,9,3,1]
print(rob(input1))
print(rob(input2))