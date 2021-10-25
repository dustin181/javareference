set1 = {3, 4, 5}
set2 = {6,7}

print(set1 - set2)
print(set2 - set1)

print(set2 & set1)

if not (set1 - set2):
    print(True)

if not (set2 - set1):
    print(True)