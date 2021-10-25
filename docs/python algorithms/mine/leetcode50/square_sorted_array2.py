def make_squares(nums):
    n = len(nums)
    squares = [0] * n
    left, right = 0, n - 1

    for i in range(n - 1, -1,-1):
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