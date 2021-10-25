
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def hasCycle(head: ListNode) -> bool:
    slow = fast = head

    if slow is None:
        return False

    while fast is not None:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return True

    return False

head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)
head.next.next.next.next.next = ListNode(6)
print("LinkedList has cycle: " + str(hasCycle(head)))

head.next.next.next.next.next.next = head.next.next
print("LinkedList has cycle: " + str(hasCycle(head)))

head.next.next.next.next.next.next = head.next.next.next
print("LinkedList has cycle: " + str(hasCycle(head)))