from typing import List
from collections import defaultdict


def groupAnagrams(strs: List[str]) -> List[List[str]]:
    d = {}

    for w in strs:
        key = tuple(sorted(w))
        d[key] = d.get(key, []) + [w]

    return list(d.values())


input1 = ["eat","tea","tan","ate","nat","bat"]

print(groupAnagrams(input1))