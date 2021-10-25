names = ["Alpha", "Bravo", "Charlie", "Delta"]
print(list(enumerate(names)))
print(list(enumerate(names, start=10)))

for i, name in enumerate(names):
    print(i, name)