from typing import List


def subsets(nums: List[int]) -> List[List[int]]:
    n = len(nums)
    all_subsets = [[]]

    for num in nums:
        list_temp = []
        for curr in all_subsets:
            list_temp.append(curr + [num])

        all_subsets.append(list_temp)

    return all_subsets


def anagrams(s: str) -> int:
    from collections import defaultdict
    substrings = defaultdict(int)

    for i in range(1, len(s)):
        for j in range(len(s) - i + 1):
            substrings[''.join(sorted(s[j:j + i]))] += 1

    ans = 0
    for key, value in substrings.items():
        ans += value * (value - 1) // 2

    return ans


nums = [1,2,3]
input = "abba"
# print(subsets(nums))
print(anagrams(input))
