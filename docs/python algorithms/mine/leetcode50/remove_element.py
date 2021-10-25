def removeElement(nums, val):
    i = 0
    for x in nums:
        if x != val:
            nums[i] = x
            i += 1
    return i


input = [3,2,2,3]
print(removeElement(input, 3))