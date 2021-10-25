from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def __repr__(self):
        return str(self.val)


def hasPathSum(root: Optional[TreeNode], targetSum: int) -> bool:
    if root is None:
        return None

    stack = [(root, root.val)]

    while stack:
        curr, curr_sum = stack.pop()

        if curr.right is None and curr.left is None and curr_sum == targetSum:
            return True
        if curr.right:
            stack.append((curr.right, curr_sum + curr.right.val))
        if curr.left:
            stack.append((curr.left, curr_sum + curr.left.val))

    return False


def sumAllPaths(root: Optional[TreeNode]) -> bool:
    if root is None:
        return None

    stack = [(root, [root.val])]

    res = []

    while stack:
        curr, path = stack.pop()

        if curr.right is None and curr.left is None:
            res.append(path)
        if curr.right:
            stack.append((curr.right, path + [curr.right.val]))
        if curr.left:
            stack.append((curr.left, path + [curr.left.val]))

    return res



def inorder(root: Optional[TreeNode]) -> str:

    if root:
        inorder(root.left)
        print(root.val)
        inorder(root.right)


root = TreeNode(5)
root.left = TreeNode(4)
root.right = TreeNode(8)
root.left.left = TreeNode(11)
root.left.left.left = TreeNode(7)
root.left.left.right = TreeNode(2)
root.right.left = TreeNode(13)
root.right.right = TreeNode(4)
root.right.right.right = TreeNode(1)
print(hasPathSum(root, 22))
print(sumAllPaths(root))

# print(inorder(root))

# print(hasPathSum2(root, 18))