def sherlock(s):
    was = dict()

    for i in range(len(s)):
        for j in range(i, len(s)):
            curr = s[i:j + 1]
            curr = "".join(sorted(curr))
            was[curr] = was.get(curr, 0) + 1

    ans = 0
    for x in was:
        v = was[x]
        ans += (v * (v-1))//2

    return ans



input = "abba"
print(sherlock(input))

