from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def __repr__(self):
        return str(self.val)


def getAllPathsToLeaves(root: Optional[TreeNode]) -> bool:
    if root is None:
        return 0

    res = []

    stack = [(root, [root.val])]

    while stack:
        curr, ls = stack.pop()

        if curr.right is None and curr.left is None:
            res.append(ls)
        if curr.right:
            stack.append((curr.right, ls + [curr.right.val]))
        if curr.left:
            stack.append((curr.left, ls + [curr.left.val]))

    return res


def sumAllPathsToLeaves(root: Optional[TreeNode]) -> bool:
    if root is None:
        return 0

    res = []

    stack = [(root, root.val)]

    while stack:
        curr, sum = stack.pop()

        if curr.right is None and curr.left is None:
            res.append(sum)
        if curr.right:
            stack.append((curr.right, sum + curr.right.val))
        if curr.left:
            stack.append((curr.left, sum + curr.left.val))

    return res


root = TreeNode(5)
root.left = TreeNode(4)
root.right = TreeNode(8)
root.left.left = TreeNode(11)
root.left.left.left = TreeNode(7)
root.left.left.right = TreeNode(2)
root.right.left = TreeNode(13)
root.right.right = TreeNode(4)
root.right.right.right = TreeNode(1)
root.right.right.left = TreeNode(5)
print(getAllPathsToLeaves(root))
print(sumAllPathsToLeaves(root))
