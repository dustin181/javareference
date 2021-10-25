from heapq import *


def minimum_cost_to_connect_ropes(ropeLengths):
    minHeap = []

    for i in ropeLengths:
        heappush(minHeap, ropeLengths[i])

    result, temp = 0, 0

    while len(minHeap) > 1:
        temp = heappop(minHeap) + heappop(minHeap)
        heappush(minHeap, temp)
        result += 1

    return result





print("Minimum cost to connect ropes: " +
str(minimum_cost_to_connect_ropes([1, 3, 11, 5])))
# Output: 33
# Explanation: First connect 1+3(=4), then 4+5(=9), and then 9+11(=20). So the total cost is 33 (4+9+20)
print("Minimum cost to connect ropes: " +
str(minimum_cost_to_connect_ropes([3, 4, 5, 6])))
# Output: 36
# Explanation: First connect 3+4(=7), then 5+6(=11), 7+11(=18). Total cost is 36 (7+11+18)
print("Minimum cost to connect ropes: " +
str(minimum_cost_to_connect_ropes([1, 3, 11, 5, 2])))
# Output: 42
# Explanation: First connect 1+2(=3), then 3+3(=6), 6+5(=11), 11+11(=22). Total cost is 42 (3+6+11+22)

