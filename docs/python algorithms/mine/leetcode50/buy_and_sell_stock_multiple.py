from typing import List


def maxProfit(prices: List[int]) -> int:
    if not prices:
        return 0

    n = len(prices)
    ans = 0

    for i in range(1,n):
        ans += max(0, prices[i] - prices[i-1])

    return ans


input = [7,1,5,3,6,4]
print(maxProfit(input))
input2 = [1,2,3,4,5]
print(maxProfit(input2))
input3 = [7,6,4,3,1]
print(maxProfit(input3))