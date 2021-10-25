def array_left_rotation(a, n, k):
    temp = [0] * n
    for i in range(n):
        temp[i] = a[(i + k) % n]

    return temp


arr = [1,2,3,4,5]
print(array_left_rotation(arr, len(arr), 2))