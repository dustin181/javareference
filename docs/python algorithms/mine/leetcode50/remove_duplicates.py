def remove_duplicates(nums):
    left = 1
    for right in range(len(nums) - 1):
        if nums[right] != nums[right + 1]:
            nums[left] = nums[right + 1]
            left += 1
    return left


print(remove_duplicates([2, 3, 3, 3, 6, 9, 9]))
print(remove_duplicates([2, 2, 2, 11]))


