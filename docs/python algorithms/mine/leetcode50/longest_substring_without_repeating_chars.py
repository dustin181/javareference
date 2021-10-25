def lengthOfLongestSubstring(s: str) -> int:
    length = len(s)
    right = 0
    left = 0
    ans = 0
    letters = {}

    while left < length and right < length:
        element = s[right]
        if element in letters:
            left = max(left, letters[element] + 1)
        letters[element] = right
        ans = max(ans, right - left + 1)
        right += 1

    return ans


#3
input1 = "abcabcbb"
#1
input2 = "bbbbb"
#3
input3 = "pwwkew"

print(lengthOfLongestSubstring(input1))
print(lengthOfLongestSubstring(input2))
print(lengthOfLongestSubstring(input3))