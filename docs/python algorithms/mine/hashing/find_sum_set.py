def findSum(lst, value):
    foundValues = set()
    for ele in lst:
        if value - ele in foundValues:
            return [value-ele, ele]
        foundValues.add(ele)
    return False


print(findSum([1, 2, 3, 4], 6))