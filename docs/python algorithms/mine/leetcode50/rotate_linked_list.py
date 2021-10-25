from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __repr__(self):
        return str(self.val)


def rotateRight(head: Optional[ListNode], k: int) -> Optional[ListNode]:
    if not head:
        return

    runner = head
    length = 1
    while runner.next:
        runner = runner.next
        length += 1

    runner.next = head

    for i in range(length - k % length - 1):
        head = head.next

    ans, head.next = head.next, None
    return ans


head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

print(rotateRight(head, 2))