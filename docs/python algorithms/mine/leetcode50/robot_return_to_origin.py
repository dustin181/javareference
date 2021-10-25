def judgeCircle(moves: str) -> bool:
    x = 0
    y = 0

    for letter in moves:
        if letter == "U":
            y += 1
        elif letter == "D":
            y -= 1
        elif letter == "L":
            x += 1
        elif letter == "R":
            x -= 1

    return x == 0 and y == 0




print(judgeCircle("UD"))
print(judgeCircle("LL"))
print(judgeCircle("RRDD"))
print(judgeCircle("LDRRLRUULR"))