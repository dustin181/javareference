from typing import List


def rotate(matrix: List[List[int]]) -> None:
    transpose(matrix)
    reflect(matrix)


def transpose(matrix):
    n = len(matrix)
    for i in range(n):
        for j in range(i, n):
            matrix[j][i], matrix[i][j] = matrix[i][j], matrix[j][i]


def reflect(matrix):
    n = len(matrix)
    for i in range(n):
        for j in range(n // 2):
            matrix[i][j], matrix[i][-j - 1] = matrix[i][-j - 1], matrix[i][j]


input = [[1,2,3],[4,5,6],[7,8,9]]
print(input)
rotate(input)
print(input)
