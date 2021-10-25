from heapq import *


class ListNode:
    def __init__(self, value):
        self.value = value
        self.next = None

    # # used for the min-heap
    # def __lt__(self, other):
    #     return self.value < other.value

    def __repr__(self):
        return str(self.value)


def merge_lists(lists):
    h = []
    for i in lists:
        while i:
            heappush(h, i.value)
            i = i.next

    head = ListNode(0)
    dummy = head
    for i in range(len(h)):
        head.next = ListNode(heappop(h))
        head = head.next

    return dummy.next


l1 = ListNode(2)
l1.next = ListNode(6)
l1.next.next = ListNode(8)

l2 = ListNode(3)
l2.next = ListNode(6)
l2.next.next = ListNode(7)

l3 = ListNode(1)
l3.next = ListNode(3)
l3.next.next = ListNode(4)

result = merge_lists([l1, l2, l3])
print("Here are the elements form the merged list: ", end='')
while result is not None:
    print(str(result.value) + " ", end='')
    result = result.next

