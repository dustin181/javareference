class Node:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.data = value

    def __repr__(self):
        return str(self.data)


root = Node(4)
root.left = Node(5)
root.right = Node(6)
root.left.left = Node(7)
