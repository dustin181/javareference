fruits_list = ["fig", "banana", "kiwi", "cherry"]
my_list = [item for item in fruits_list if "i" in item]
print(my_list)

new_list = [new_char for new_char in "Power of Comprehension"]
print(new_list)

new_matrix = [[y for y in range(3)] for x in range(6)]
print(new_matrix)
