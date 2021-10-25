from typing import List


def missingNumber(nums: List[int]) -> int:
    n = len(nums)

    nums.sort()

    if nums[-1] != n:
        return n
    elif nums[0] != 0:
        return 0

    i = 1

    while i < n:
        if nums[i] != nums[i-1] + 1:
            return nums[i] - 1
        i += 1

    return -1


def missingNumberXor(nums: List[int]) -> int:
    missing = len(nums)
    for i, num in enumerate(nums):
        missing ^= i ^ num
    return missing


def missingNumberGauss(nums: List[int]) -> int:
    n = len(nums)
    expected = (n * (n+1))//2
    actual = sum(nums)

    return expected - actual


nums1 = [3,0,1]
print(missingNumberGauss(nums1))
nums2 = [0,1]
print(missingNumberGauss(nums2))
nums3 = [9,6,4,2,3,5,7,0,1]
print(missingNumber(nums3))
nums4 = [0]
print(missingNumberXor(nums3))
print(missingNumberGauss(nums3))