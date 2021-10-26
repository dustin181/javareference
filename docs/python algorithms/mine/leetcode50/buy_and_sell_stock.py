from typing import List


def maxProfit(prices: List[int]) -> int:
    if not prices:
        return 0

    maxProf = 0
    minPurchase = prices[0]

    for i in range(1, len(prices)):
        maxProf = max(maxProf, prices[i] - minPurchase)
        minPurchase = min(minPurchase, prices[i])

    return maxProf


input = [7,1,5,3,6,4]
print(maxProfit(input))