from typing import List


def numRescueBoats(people: List[int], limit: int) -> int:
    length = len(people)
    if length == 1:
        return 1

    people.sort()
    left = 0
    right = length - 1
    boats = 0

    while left <= right:
        if left == right:
            boats += 1
            break
        if people[left] + people[right] <= limit:
            boats += 1
            right -= 1
            left += 1
        else:
            boats += 1
            right -= 1

    return boats






people1 = [1, 2]
limit1 = 3
print(numRescueBoats(people1, limit1))

people2 = [3, 2, 2, 1]
limit2 = 3
print(numRescueBoats(people2, limit2))

people3 = [3, 5, 3, 4]
limit3 = 5
print(numRescueBoats(people3, limit3))
