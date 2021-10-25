def find_second_maximum(lst):
    lst.sort()
    if len(lst) >= 2:
        return lst[-2]
    else:
        return None


print(find_second_maximum([9, 2, 3, 6]))