def make_squares(nums):
    squares = [0] * len(nums)
    left = 0
    right = len(nums) - 1

    for i in range(len(nums) - 1, -1, -1):
        left_abs = nums[left] ** 2
        right_abs = nums[right] ** 2
        if left_abs > right_abs:
            squares[i] = left_abs
            left += 1
        else:
            squares[i] = right_abs
            right -= 1

    return squares


print("Squares: " + str(make_squares([-2, -1, 0, 2, 3])))
print("Squares: " + str(make_squares([-3, -1, 0, 1, 2])))