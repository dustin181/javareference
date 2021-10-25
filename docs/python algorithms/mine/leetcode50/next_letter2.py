def search_next_letter(letters, key):
    n = len(letters)

    left, right = 0, n - 1

    while left <= right:
        mid = (left + right) // 2
        if key < letters[mid]:
            right = mid - 1
        else:
            left = mid + 1

    return letters[left % n]




print(search_next_letter(['a', 'c', 'f', 'h'], 'f'))
print(search_next_letter(['a', 'c', 'f', 'h'], 'b'))
print(search_next_letter(['a', 'c', 'f', 'h'], 'm'))
print(search_next_letter(['a', 'c', 'f', 'h'], 'h'))
