def minimumBribes(q):
    bribes = 0

    for i in range(len(q) - 1, -1, -1):
        if q[i] - (i + 1) > 2:
            return "too chaotic"

        for j in range(max(0, q[i - 2]), i):
            if q[j] > q[i]:
                bribes += 1

    return bribes


input1 = [1,2,3,5,4,6,7,8]
input2 = [4,1,2,3]
print(minimumBribes(input1))
print(minimumBribes(input2))