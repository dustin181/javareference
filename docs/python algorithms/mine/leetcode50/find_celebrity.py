# def findCelebrity(n: int) -> int:
#     left, right = 0, n - 1
#
#     while left < right:
#         if knows(left, right):
#             left += 1
#         else:
#             right -= 1
#
#     for i in range(n):
#         if not knows(i, left) and i != left:
#             return -1
#
#     for i in range(n):
#         if knows(left, i) and i != left:
#             return -1
#
#     return left
#
#
# input = [[1,1,0],[0,1,0],[1,1,1]]
# print(findCelebrity(input))