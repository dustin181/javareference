# 123
#
# 123 / 10 = 12 remainder 3
# 12/10    = 1  remainder 2
#
# f(n) = n%10 + f(n/10)

def sum_of_digits(n):
    if n == 0:
        return 0
    return int(n%10) + sum_of_digits(int(n/10))

print(sum_of_digits(1234))