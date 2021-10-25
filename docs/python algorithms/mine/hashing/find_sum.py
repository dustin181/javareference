def findSum(lst, k):
    foundValues = {}
    for ele in lst:
        # Check for value in dictionary
        # If found return
        try:
            foundValues[k - ele]
            return [k - ele, ele]
        except KeyError:
            foundValues[ele] = 0
    return "No numbers add upto k"


print(findSum([1, 3, 2, 4], 6))