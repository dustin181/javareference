from typing import List


def dailyTemperaturesBrute(temperatures: List[int]) -> List[int]:
    res = [0] * len(temperatures)
    for i in range(len(temperatures)):
        for j in range(i, len(temperatures)):
            if temperatures[j] > temperatures[i]:
                res[i] = j - i
                break  # guarentee the soonest
    return res


def dailyTemperatures(temperatures: List[int]) -> List[int]:
    n = len(temperatures)
    res = [0] * n
    stack = []

    for i in range(n - 1, -1, -1):
        while stack and (temperatures[i] >= temperatures[stack[-1]]):
            stack.pop()
        if stack:
            res[i] = stack[-1] - 1
        stack.append(i)

    return res



temperatures1 = [73,74,75,71,69,72,76,73]
temperatures2 = [30,40,50,60]
temperatures3 = [30,60,90]

print(dailyTemperatures(temperatures1))
print(dailyTemperatures(temperatures2))
print(dailyTemperatures(temperatures3))