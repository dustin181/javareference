# 2 ^ 3 = 2 * 2 * 2
#
# n * y = n * n * n

def power(base, exp):

    if exp == 0:
        return 1
    if exp == 1:
        return base

    return base * power(base, exp - 1)


print(power(3, 3))