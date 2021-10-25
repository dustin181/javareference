from typing import List


def containsDuplicate(nums: List[int]) -> bool:

    n = len(nums)
    i = 0
    tracker = {}
    while i < n:
        if nums[i] in tracker:
            return True
        else:
            tracker[nums[i]] = i

        i += 1

    return False


nums1 = [1,2,3,1]
nums2 = [1,2,3,4]
nums3 = [1,1,1,3,3,4,3,2,4,2]


print(containsDuplicate(nums1))
print(containsDuplicate(nums2))
print(containsDuplicate(nums3))