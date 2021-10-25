from collections import defaultdict


def longest_substring_with_k_distinct(s, k):
    if k == 0:
        return 0

    left = 0
    count = defaultdict(int)
    max_len = 0

    for right in range(len(s)):
        count[s[right]] += 1

        while left < right and len(count) > k:
            if count[s[left]] == 1:
                del count[s[left]]
            else:
                count[s[left]] -= 1

            left += 1

        max_len = max(max_len, right - left + 1)

    return max_len







print("Length of the longest substring: " + str(longest_substring_with_k_distinct("araaci", 2)))
print("Length of the longest substring: " + str(longest_substring_with_k_distinct("araaci", 1)))
print("Length of the longest substring: " + str(longest_substring_with_k_distinct("cbbebi", 3)))
print("Length of the longest substring: " + str(longest_substring_with_k_distinct("cbbebi", 10)))