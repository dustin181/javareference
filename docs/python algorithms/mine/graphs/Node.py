class Node:
    def __init__(self, data):
        self.data = data  # Data field
        self.next_element = None  # Pointer to next node

    def __repr__(self):
        return str(self.data)