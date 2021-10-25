from typing import List


def moveZeroes(nums) -> None:
    j = 0
    n = len(nums)
    for num in nums:
        if num != 0:
            nums[j] = num
            j+=1

    for x in range(j, n):
        nums[x] = 0


input = [0, 1, 0, 3, 12]
moveZeroes(input)
print(input)

#input: 0 1 0 3 12
#output: 1 3 12 0 0

# #input: 0 1 0 3 12
#
# j = 0
# n = 5
# num = 0
# ***
# num = 1
# nums[0] = 1
# output = 1 1 0 3 12
# j = 1
# ***
# num = 0
# n = 5
# ****
# num = 3
# nums[1] = 3
# j = 2
# output = 1 3 0 3 12
# *****
# num = 12
# nums[2] = 12
# j = 3
# output = 1 3 12 3 12
# ****




