from typing import List


def intervalIntersection(a: List[List[int]], b: List[List[int]]) -> List[List[int]]:
    m, n = len(A), len(B)
    i = j = 0
    res = []
    while i < m and j < n:
        if A[i][-1] >= B[j][0] and A[i][0] <= B[j][-1]:
            res.append([max(A[i][0], B[j][0]), min(A[i][-1], B[j][-1])])
        if A[i][-1] < B[j][-1]:
            i += 1
        else:
            j += 1
    return res


arr1 = [[1, 3], [5, 6], [7, 9]]
arr2 = [[2, 3], [5, 7]]

arr3 = [[1, 3], [5, 7], [9, 12]]
arr4 = [[5, 10]]

print(intervalIntersection(arr1, arr2))
# Output: [2, 3], [5, 6], [7, 7]
print(intervalIntersection(arr3, arr4))
# Output: [5, 7], [9, 10]