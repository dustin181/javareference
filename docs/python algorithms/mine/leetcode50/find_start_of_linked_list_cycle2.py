class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def findCycle(head):
    slow = fast = head

    while fast and fast.next.next:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            break

    if not fast or not fast.next:
        return None

    slow = head

    while slow != fast:
        slow = slow.next
        fast = fast.next

    return slow


head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)
head.next.next.next.next.next = ListNode(6)

head.next.next.next.next.next.next = head.next.next
print("LinkedList cycle start: " + str(findCycle(head).val))

head.next.next.next.next.next.next = head.next.next.next
print("LinkedList cycle start: " + str(findCycle(head).val))

head.next.next.next.next.next.next = head
print("LinkedList cycle start: " + str(findCycle(head).val))