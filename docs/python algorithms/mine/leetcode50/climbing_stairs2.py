def climbStairs(n: int) -> int:
    if n < 2:
        return n

    dp = [0] * (n + 1)

    dp[1] = 1
    dp[2] = 2

    if n > 2:
        for i in range(3, (n + 1)):
            dp[i] = dp[i - 1] + dp[i - 2]

    return dp[n]





print(climbStairs(2))
print(climbStairs(3))
print(climbStairs(5))
print(climbStairs(6))