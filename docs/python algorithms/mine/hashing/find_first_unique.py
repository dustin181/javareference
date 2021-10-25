def findFirstUnique(lst):
    counts = {}  # Creating a dictionary
    # Initializing dictionary with pairs like (lst[i],count)
    counts = counts.fromkeys(lst, 0)
    for ele in lst:
        # counts[ele] += 1  # Incrementing for every repitition
        counts[ele] = counts[ele]+1
    answer_key = None
    # filter first non-repeating
    for ele in lst:
        if (counts[ele] is 1):
            answer_key = ele
            break
    return answer_key


print(findFirstUnique([1, 1, 1, 2]))