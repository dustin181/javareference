from typing import List


def maxArea(height: List[int]) -> int:

    length = len(height)
    left = 0
    right = length - 1
    maxArea = 0

    while left < right:
        maxArea = max(maxArea, min(height[left], height[right]) * (right - left))
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1

    return maxArea




input = [1, 8, 6, 2, 5, 4, 8, 3, 7]
print(maxArea(input))
