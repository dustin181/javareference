from collections import deque


class LRUCache:

    def __init__(self, capacity: int):
        self.c = capacity
        self.m = dict()
        self.deq = deque()

    # If the element exists in the hashmap, our first step is to
    # move the accessed element to the tail of the linked list
    def get(self, key: int) -> int:
        if key in self.m:
            value = self.m[key]
            self.deq.remove(key)
            self.deq.append(key)
            return value
        else:
            return -1

    # If the data structure is at its capacity, remove the element at the head of the linked list and
    # the Hash Map. Then, we add the new element at the tail of the linked list and in the Hash Map
    def put(self, key: int, value: int) -> None:
        if key not in self.m:
            if len(self.deq) == self.c:
                oldest = self.deq.popleft()
                del self.m[oldest]
        else:
            self.deq.remove(key)

        self.m[key] = value
        self.deq.append(key)


lruCache = LRUCache(2)
lruCache.put(1, 1) # cache is {1=1}
lruCache.put(2, 2) # cache is {1=1, 2=2}
lruCache.get(1)    # return 1
lruCache.put(3, 3) # LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lruCache.get(2)    # returns -1 (not found)
lruCache.put(4, 4) # LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lruCache.get(1)    # return -1 (not found)
lruCache.get(3)   # return 3
lruCache.get(4)    # return 4


