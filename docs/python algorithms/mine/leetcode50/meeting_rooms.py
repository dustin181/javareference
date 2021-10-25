from typing import List


def minMeetingRooms(intervals: List[List[int]]) -> int:
    starts = sorted(i[0] for i in intervals)
    ends = sorted(i[1] for i in intervals)
    i = count = 0
    for s in starts:
        if s < ends[i]:
            count += 1
        else:
            i += 1
    return count


input1 = [[0,30],[5,10],[15,20]]
input2 = [[7,10],[2,4]]

print(minMeetingRooms(input1))
print(minMeetingRooms(input2))