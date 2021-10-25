def isValid(s):
    dct = {"(": ")", "[": "]", "{": "}"}
    stack = []

    for char in s:
        if char in dct:
            stack.append(char)
        else:
            if not stack or char != dct[stack.pop()]:
                return False
    return not stack




s = "()[]{}"
s2 = "(((((((]"
print(isValid(s))
print(isValid(s2))