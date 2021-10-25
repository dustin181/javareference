from typing import List


def coinChange(coins: List[int], amount: int) -> int:
    if amount <= 0:
        return 0
    if min(coins) > amount:
        return -1

    dp = [0] + [float('inf')] * amount

    for coin in coins:
        for i in range(coin, amount + 1):
            dp[i] = min(dp[i], dp[i - coin] + 1)

    return dp[-1] if dp[-1] != float('inf') else -1


input = [2,5]
amount = 11

print(coinChange(input, amount))