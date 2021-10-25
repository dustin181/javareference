def addTwoDigits(n):
    ans = 0
    for x in str(n):
        ans += int(x)

    return ans

input = 29

print(addTwoDigits(input))

