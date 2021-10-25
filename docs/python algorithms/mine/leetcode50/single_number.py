from collections import Counter
from typing import List


def singleNumber(nums: List[int]) -> int:
    a = 0
    for i in nums:
        a ^= i
    return a


def singleNumber2(nums: List[int]) -> int:

    c = Counter(nums)

    return c.most_common()[::-1][0][0]


input1 = [2,2,1]
input2 = [4,1,2,1,2]
input3 = [1]

print(singleNumber(input1))
print(singleNumber(input2))
print(singleNumber(input3))

print(singleNumber2(input1))
print(singleNumber2(input2))
print(singleNumber2(input3))