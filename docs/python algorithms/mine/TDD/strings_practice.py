brands = ["fender", "stratocaster", "gibson"]

test = f"I own {len(brands)} brands of guitars"

print(test)

test2 = f"This is 1/7 to 3 decimal places: {(1/7):.3f}"

print(test2)

test3 = f"This is 1/7 to 6 decimal places: {(1/7):.6f}"

print(test3)

test4 = f"{(1/7000):.5E}"

print(test4)

for j in [1, 141, 1441, 14441]:
    print(f"| {j:5} | {j*j:010} |")

words = ['If', 'you', 'have', 'a', 'list']

print("".join(words))
print(' '.join(words))
print('\n'.join(words))

test5 = "".join([c for c in "OX63 5WC - SL46 3AP - BN96 0VU" if c.isdigit()])
print(test5)

text = " SPECIAL # SALE # TODAY "
test6 = [word.strip() for word in text.split('#')]
print(test6)

