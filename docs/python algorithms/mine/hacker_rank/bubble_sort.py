def bubble_sort(nums):
    swaps = 0
    for i in range(len(nums)):
        for j in range(len(nums) - 1):
            if nums[j] > nums[i]:
                swaps += 1
                nums[i], nums[j] = nums[j], nums[i]

    return swaps, nums


input = [7, 1, 3, 2, 4, 5, 6]
print(bubble_sort(input))





