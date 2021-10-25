def find_subsets(nums):
    nums.sort()
    subsets = [[]]

    for currentnumber in nums:
        n = len(subsets)

        for i in range(n):
            set1 = list(subsets[i])
            set1.append(currentnumber)
            if set1 not in subsets:
                subsets.append(set1)

    return subsets


# print("Here is the list of subsets: " + str(find_subsets([1, 3])))
print("Here is the list of subsets: " + str(find_subsets([1, 5, 3, 3])))
print("Here is the list of subsets: " + str(find_subsets2([1, 5, 3, 3])))