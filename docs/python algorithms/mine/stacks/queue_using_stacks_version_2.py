# We can use 2 stacks for this purpose,main_stack to store original values
# and temp_stack which will help in enqueue operation.
# Main thing is to put first entered element at the top of main_stack

from Stack import MyStack


class NewQueue:

    # Can use size from argument to create stack
    def __init__(self):
        self.main_stack = MyStack()
        self.temp_stack = MyStack()

    # Inserts Element in the Queue
    def enqueue(self, value):
        # Push the value into main_stack in O(1)
        self.main_stack.push(value)
        print(str(value) + " enqueued")

    # Removes Element From Queue
    def dequeue(self):
        # If both stacks are empty, end operation
        if not self.temp_stack.is_empty():
            front = self.temp_stack.pop()
            print(str(front) + " dequeued")
            return front
        if self.temp_stack.is_empty() and self.main_stack.is_empty():
            return None
        # Transfer all elements to temp_stack
        while not self.main_stack.is_empty():
            self.temp_stack.push(self.main_stack.pop())
        # Pop the first value. This is the oldest element in the queue
        front = self.temp_stack.pop()
        print(str(front) + " dequeued")
        return front


if __name__ == "__main__":
    queue = NewQueue()
    for i in range(5):
        queue.enqueue(i + 1)
    print("----------")
    for i in range(5):
        queue.dequeue()
