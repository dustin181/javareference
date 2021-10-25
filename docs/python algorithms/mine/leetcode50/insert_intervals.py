from typing import List


def invert(intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
    ans = []
    all_intervals = intervals + [newInterval]

    for beg, end in sorted(all_intervals):
        if not ans or ans[-1][1] < beg:
            ans += [[beg, end]]
        else:
            ans[-1][1] = max(ans[-1][1], end)

    return ans


input1 = [[1,3], [5,7], [8,12]]
newInterval1 = [4,6]
# Output: [[1,3], [4,7], [8,12]]
# Explanation: After insertion, since [4,6] overlaps with [5,7], we merged them into one [4,7].
input2 = [[1,3], [5,7], [8,12]]
newInterval2 = [4,10]
# Output: [[1,3], [4,12]]
# Explanation: After insertion, since [4,10] overlaps with [5,7] & [8,12], we merged them into [4,12].
input3 = [[2,3],[5,7]]
newInterval3 = [1,4]
# Output: [[1,4], [5,7]]
# Explanation: After insertion, since [1,4] overlaps with [2,3], we merged them into one [1,4].


print(invert(input1, newInterval1))
print(invert(input2, newInterval2))
print(invert(input3, newInterval3))