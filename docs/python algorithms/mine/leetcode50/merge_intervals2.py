from typing import List


def merge(intervals: List[List[int]]) -> List[List[int]]:
    ans = []

    for beg, end in sorted(intervals):
        if not ans or ans[-1][1] < beg:
            ans += [[beg, end]]
        else:
            ans[-1][1] = max(ans[-1][1], end)

    return ans



input1 = [[1,3],[2,6],[8,10],[15,18]]
# Output: [[1,6],[8,10],[15,18]]
# Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
input2 = [[1,4],[4,5]]
# Output: [[1,5]]
# Explanation: Intervals [1,4] and [4,5] are considered overlapping.


print(merge(input1))
print(merge(input2))