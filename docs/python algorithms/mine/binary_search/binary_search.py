def binary_search(arr, key):
  start = 0
  end = len(arr) - 1

  while start <= end:
    middle = int((start + end) / 2)

    if key == arr[middle]:
        return middle

    if key < arr[middle]:
        end = middle - 1
    else:
        start = middle + 1


  return -1  # element not found


def main():
  print(binary_search([4, 6, 10], 10))
  print(binary_search([1, 2, 3, 4, 5, 6, 7], 5))
  # print(binary_search([10, 6, 4], 10))
  # print(binary_search([10, 6, 4], 4))


main()
