# iterate over list
# collect index and given - number in map
# if value in map, add index pair (current index, index from map) to list

# 9 - 2 = 7 index = 0
# 9 - 6 = 3 index = 1
# 9 - 3 = 6 index = 2
# 9 - 9 = 0 index = 3
# 9 - 11 = -2 index = 4


def find_all_pairs(numbers, given):

    sums = dict()
    pairs = []
    i = 0

    while i < len(numbers):
        if given - numbers[i] in sums.keys():
            pairs.append([numbers[i], given-numbers[i]])
        else:
            sums.update({numbers[i]: i})
        i += 1

    return pairs


numbers = [2, 6, 3, 9, 11, 4, 5]
given = 9

print(find_all_pairs(numbers, given))

