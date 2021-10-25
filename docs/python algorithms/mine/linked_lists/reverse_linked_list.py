class Node:
  def __init__(self, value, next=None):
    self.value = value
    self.next = next

  def __repr__(self):
    return str(self.value)


def reverseList(head):  # Iterative
    prev, curr = None, head
    while curr:
        curr.next, prev, curr = prev, curr, curr.next
    return prev

# def reverseList(head):
#   prev = None
#   current = head
#   while (current is not None):
#       next = current.next
#       current.next = prev
#       prev = current
#       current = next
#   head = prev


def main():
  head = Node(1)
  head.next = Node(2)
  head.next.next = Node(3)
  head.next.next.next = Node(4)
  head.next.next.next.next = Node(5)

  reverseList(head)
  print("test")

main()
