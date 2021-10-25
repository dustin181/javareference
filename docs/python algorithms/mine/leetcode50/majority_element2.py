from typing import List
from collections import Counter


def majorityElement(nums: List[int]) -> int:
    nums.sort()
    return nums[len(nums)//2]


def majorityElement2(nums: List[int]) -> int:
    return Counter(nums).most_common(1)[0][0]


input1 = [3,2,3]
input2 = [2,2,1,1,1,2,2]
input3 = [4,5,4,55,66,77,88,4,4,4,102,4,156,190, 4, 4, 4, 4]

print(majorityElement(input1))
print(majorityElement(input2))
print(majorityElement(input3))
# print(majorityElement2(input1))
# print(majorityElement2(input2))
