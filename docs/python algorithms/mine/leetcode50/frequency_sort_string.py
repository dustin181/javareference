from collections import defaultdict
from heapq import heappush, heappop


def sort_character_by_frequency(str):
    d = defaultdict(int)

    for i in str:
        d[i] = d[i] + 1

    heap = []

    for key, value in d.items():
        heappush(heap, (-value, key))

    result = []

    while heap:
        value, key = heappop(heap)
        result.append(key * -value)

    return ''.join(result)

print(sort_character_by_frequency("Programming"))




# print("String after sorting characters by frequency: " +
#     sort_character_by_frequency("Programming"))
# # Input: "Programming"
# # Output: "rrggmmPiano"
# print("String after sorting characters by frequency: " +
#     sort_character_by_frequency("abcbab"))
# # Input: "abcbab"
# # Output: "bbbaac"

