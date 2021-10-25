class TreeNode:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def find_paths(root, targetSum):
    all_paths = []

    if root is None:
        return all_paths

    stack = [(root, [root.val])]

    while stack:
        curr, ls = stack.pop()
        if curr.right is None and curr.left is None and sum(ls) == targetSum:
            all_paths.append(ls)
        if curr.left:
            stack.append((curr.left, ls + [curr.left.val]))
        if curr.right:
            stack.append((curr.right, ls + [curr.right.val]))

    return all_paths




root = TreeNode(12)
root.left = TreeNode(7)
root.right = TreeNode(1)
root.left.left = TreeNode(4)
root.right.left = TreeNode(10)
root.right.right = TreeNode(5)
targetSum = 23
print("Tree paths with sum " + str(sum) +
    ": " + str(find_paths(root, targetSum)))

