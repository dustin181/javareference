from typing import List
from collections import Counter


def majorityElement(nums: List[int]) -> int:
    n = len(nums)
    i = 0
    m = {}
    while i < n:

        m[nums[i]] = m.get(nums[i], 0) + 1
        if m[nums[i]] > n // 2:
            return nums[i]
        i += 1

    return -1


def majorityElement2(nums: List[int]) -> int:
    return Counter(nums).most_common(1)[0][0]


input1 = [3,2,3]
input2 = [2,2,1,1,1,2,2]

print(majorityElement(input1))
print(majorityElement(input2))
print(majorityElement2(input1))
print(majorityElement2(input2))
