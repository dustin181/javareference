def firstUniqChar(s: str) -> int:
    d = {}

    for c in s:
        if c in d.keys():
            d[c] += 1
        else:
            d[c] = 1

    for i in range(len(s)):
        if d[s[i]] == 1:
            return i

    return -1



input1 = "leetcode"
input2 = "loveleetcode"
input3 = "aabb"

print(firstUniqChar(input1))
print(firstUniqChar(input2))
print(firstUniqChar(input3))