from heapq import *


def find_k_largest_numbers(nums, k):
  minHeap = []
  # put first 'K' numbers in the min heap
  for i in range(k):
    heappush(minHeap, nums[i])

  # go through the remaining numbers of the arrayorlist, if the number from the arrayorlist is bigger than the
  # top(smallest) number of the min-heap, remove the top number from heap and add the number from arrayorlist
  for i in range(k, len(nums)):
    if nums[i] > minHeap[0]:
      heappop(minHeap)
      heappush(minHeap, nums[i])

  # the heap has the top 'K' numbers, return them in a list
  return list(minHeap)


def main():

  print("Here are the top K numbers: " +
        str(find_k_largest_numbers([3, 1, 5, 12, 2, 11], 3)))

  print("Here are the top K numbers: " +
        str(find_k_largest_numbers([5, 12, 11, -1, 12], 3)))


main()