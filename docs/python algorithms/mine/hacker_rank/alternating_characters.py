def count_deletions(s):
    count = 0
    for x in range(1, len(s)):
        if s[x] == s[x - 1]:
            count += 1

    return count


input1 = "AAAA"
input2 = "ABABABAB"
input3 = "AAABBB"

print(count_deletions(input1))
print(count_deletions(input2))
print(count_deletions(input3))
