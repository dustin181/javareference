def recursiveRange(num):
    if num <= 0:
        return 0

    print(num)
    return num + recursiveRange(num - 1)


def recursiveRangeAscending(num, limit):
    if num > limit:
        return 0

    print(num)
    return num + recursiveRangeAscending(num + 1, limit)


# print(recursiveRange(6))
recursiveRange(6)
recursiveRangeAscending(1,6)