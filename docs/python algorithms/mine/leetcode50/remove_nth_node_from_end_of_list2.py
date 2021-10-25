class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def removeNthFromEnd(head: Optional[ListNode], n: int) -> Optional[ListNode]:
    fast = slow = head

    for x in range(n):
        fast = fast.next

    if not fast:
        return fast

    while fast.next:

        if fast.next is None:
            return slow.next

        slow = slow.next
        fast = fast.next


