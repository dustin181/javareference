from typing import List


def dfs(grid, i, j):
    length = len(grid)
    width = len(grid[0])

    if i < 0 or j < 0 or i >= length or j >= width or grid[i][j] != '1':
        return

    grid[i][j] = '#'
    dfs(grid, i + 1, j)
    dfs(grid, i - 1, j)
    dfs(grid, i, j + 1)
    dfs(grid, i, j - 1)


def numIslands(grid: List[List[int]]):
    if not grid:
        return 0

    length = len(grid)
    width = len(grid[0])
    count = 0

    for i in range(length):
        for j in range(width):
            if grid[i][j] == '1':
                dfs(grid, i, j)
                count += 1

    return count

grid1 = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]

grid2 = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]

# print(numIslands(grid1))
print(numIslands(grid2))
