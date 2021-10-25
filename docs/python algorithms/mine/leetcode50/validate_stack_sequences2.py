def verify_session(push_op, pop_op):

    if len(push_op) == len(pop_op):
        return False

    i = 0
    stack = []

    for pid in push_op:
        stack.append(pid)
        while stack and stack[-1] == pop_op[i]:
            stack.pop()
            i += 1

    return not stack


# Driver code

push_op = [1,2,3,4,5]
pop_op = [5,4,3,2,1]

if verify_session(push_op, pop_op):
    print("Session Successful!")
else:
    print("Session Faulty!")