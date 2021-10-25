from heapq import *


def find_sum_of_elements(nums, k1, k2):
    minHeap = []
    # insert all numbers to the min heap
    for num in nums:
        heappush(minHeap, num)

    # remove k1 small numbers from the min heap
    for i in range(k1):
        heappop(minHeap)

    elementSum = 0
    # sum next k2-k1-1 numbers
    for i in range(k2 - k1 - 1):
        elementSum += heappop(minHeap)

    return elementSum


print("Sum of all numbers between k1 and k2 smallest numbers: " +
    str(find_sum_of_elements([1, 3, 12, 5, 15, 11], 3, 6)))
# [1,3,5,11,12,15]
# Explanation: The 3rd smallest number is 5 and 6th smallest number 15. The sum of numbers coming
# between 5 and 15 is 23 (11+12).
print("Sum of all numbers between k1 and k2 smallest numbers: " +
    str(find_sum_of_elements([3, 5, 8, 7], 1, 4)))
# [3,5,7,8]
# Explanation: The sum of the numbers between the 1st smallest number (3) and the 4th smallest
# number (8) is 12 (5+7).









