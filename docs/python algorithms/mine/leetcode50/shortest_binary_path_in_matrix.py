def shortestPathBinaryMatrix(self, grid):
    # no possible way to get there
    if grid[0][0] or grid[-1][-1]:
        return -1
    # do a BFS
    q = [[0, 0, 1]]
    directions = [[0, 1], [0, -1], [1, 1], [1, -1], [-1, 0], [1, 0], [-1, -1], [-1, 1]]
    grid[0][0] = 1

    while q:
        row, col, length = q.pop(0)
        if row == len(grid) - 1 and col == len(grid) - 1:
            return length

        for x, y in directions:

            r = row + x
            c = col + y

            if r >= 0 and c >= 0 and r < len(grid) and c < len(grid[0]) and grid[r][c] == 0:
                grid[r][c] = 1
                q.append([r, c, length + 1])
    return -1