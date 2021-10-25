from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __repr__(self):
        return str(self.val)


def removeNthFromEnd(head: Optional[ListNode], n: int) -> Optional[ListNode]:
    fast = slow = head

    for x in range(n):
        fast = fast.next

    if not fast:
        return head.next

    while fast.next is not None:
        slow = slow.next
        fast = fast.next

    slow.next = slow.next.next

    return head


head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

print(removeNthFromEnd(head, 2))