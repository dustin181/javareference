def sherlock(s):
    was = dict()
    n = len(s)
    for i in range(n):
        for j in range(i, n):
            cur = s[i:j + 1]
            cur = ''.join(sorted(cur))
            was[cur] = was.get(cur, 0) + 1

    ans = 0
    for x in was:
        v = was[x]
        ans += (v * (v - 1)) // 2

    return ans


input = "abba"
print(sherlock(input))