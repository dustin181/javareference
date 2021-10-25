from typing import List


def canAttendAllAppointments(intervals: List[List[int]]) -> List[List[int]]:
    ans = []

    for beg, end in sorted(intervals):
        if not ans or ans[-1][1] < beg:
            ans += [[beg, end]]
        else:
            # ans[-1][1] = max(ans[-1][1], end)
            return False

    return True


input1 = [[1,4], [2,5], [7,9]]
# Output: false
# Explanation: Since [1,4] and [2,5] overlap, a person cannot attend both of these appointments.
input2 = [[6,7], [2,4], [8,12]]
# Output: true
# Explanation: None of the appointments overlap, therefore a person can attend all of them.
input3 = [[4,5], [2,3], [3,6]]
# Output: false
# Explanation: Since [4,5] and [3,6] overlap, a person cannot attend both of these appointments.


print(canAttendAllAppointments(input1))
print(canAttendAllAppointments(input2))
print(canAttendAllAppointments(input3))