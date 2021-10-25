def powerOfTwo(n):
    if n == 0:
         return 1
    else:
        power = powerOfTwo(n-1)
        # print("n : " + str(n))
        # print(power * 2)
        return power * 2

print(powerOfTwo(3))