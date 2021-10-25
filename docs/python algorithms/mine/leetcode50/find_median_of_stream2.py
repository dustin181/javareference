from heapq import *


class median_of_ages:
    maxHeap = []
    minHeap = []

    def insert_age(self, num: int):
        if not self.maxHeap or -self.maxHeap[0] <= num:
            heappush(self.maxHeap, -num)
        else:
            heappush(self.minHeap, num)

        if len(self.maxHeap) > len(self.minHeap) + 1:
            heappush(self.minHeap, -heappop(self.maxHeap))
        elif len(self.maxHeap) < len(self.minHeap):
            heappush(self.maxHeap, -heappop(self.minHeap))

    def find_median(self):

        if len(self.maxHeap) == len(self.minHeap):
            return -self.maxHeap[0] / 2.0 + self.minHeap[0] / 2.0

        return -self.maxHeap[0] / 1.0




# Driver code


medianAge = median_of_ages()
medianAge.insert_age(22)
medianAge.insert_age(35)
print("The recommended content will be for ages under: " + str(medianAge.find_median()))
medianAge.insert_age(30)
print("The recommended content will be for ages under: " + str(medianAge.find_median()))
medianAge.insert_age(25)
print("The recommended content will be for ages under: " + str(medianAge.find_median()))