import heapq
from collections import defaultdict


def find_k_frequent_numbers(nums, k):
    d = defaultdict(int)
    for i in nums:
        d[i] = d[i] + 1
    heap = []
    for key, val in d.items():
        if len(heap) < k:
            heapq.heappush(heap, (val, key))
        else:
            if val > heap[0][0]:
                heapq.heappop(heap)
                heapq.heappush(heap, (val, key))

    result = []
    for i in heap:
        result.append(i[1])
    return result


print("Here are the K frequent numbers: " +
    str(find_k_frequent_numbers([1, 3, 5, 12, 11, 12, 11], 2)))
# Output: [12, 11]
# Explanation: Both'11' and '12'apearedtwice.
print("Here are the K frequent numbers: " +
    str(find_k_frequent_numbers([5, 12, 11, 3, 11], 2)))
# Output: [11, 5] or [11, 12] or [11, 3]
# Explanation: Only'11'appearedtwice, allothernumbersappearedonce.


