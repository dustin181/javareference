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
        return False

    stack = [(root, root.val)]

    while stack:
        curr, curr_sum = stack.pop()

        if not curr.right and not curr.left and targetSum == curr_sum:
            return True
        if curr.right:
            stack.append((curr.right, curr_sum + curr.right.val))
        if curr.left:
            stack.append((curr.left, curr_sum + curr.left.val))
    return False


def hasPathSum2(root: Optional[TreeNode], targetSum: int) -> bool:
    if root is None:
        return False

    stack = [(root, root.val, [root.val])]

    while stack:
        curr, curr_sum, ls = stack.pop()

        if not curr.right and not curr.left and targetSum == curr_sum:
            return True
        if curr.right:
            stack.append((curr.right, curr_sum + curr.right.val, ls + [curr.right.val]))
        if curr.left:
            stack.append((curr.left, curr_sum + curr.left.val, ls + [curr.left.val]))
    return False




root = TreeNode(5)
root.left = TreeNode(4)
root.right = TreeNode(8)
root.left.left = TreeNode(11)
root.left.left.left = TreeNode(7)
root.left.left.right = TreeNode(2)
root.right.left = TreeNode(13)
root.right.right = TreeNode(4)
root.right.right.right = TreeNode(1)
print(hasPathSum(root, 18))

print(hasPathSum2(root, 18))