def searchMatrix(matrix, target):
    m, n = len(matrix), len(matrix[0])
    row, column = 0, n - 1
    while row < m and column >= 0:
        if target > matrix[row][column]:
            row += 1
        elif target < matrix[row][column]:
            column -= 1
        else:
            return True
    return False


matrix1 = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target1 = 5

matrix2 = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target2 = 20

print(searchMatrix(matrix1, target1))
print(searchMatrix(matrix2, target2))