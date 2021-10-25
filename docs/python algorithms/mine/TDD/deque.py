from collections import deque

waiting_list = deque()

print(waiting_list)

waiting_list.append("alpha")
waiting_list.append("bravo")
waiting_list.append("charlie")
waiting_list.append("delta")

print(waiting_list)

waiting_list.popleft()
print(waiting_list)

waiting_list.pop()
print(waiting_list)

