from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def twoSumBSTs(root1: Optional[TreeNode], root2: Optional[TreeNode], target: int) -> bool:

    def inOrder(root: Optional[TreeNode]):

        if root is None:
            return []

        return inOrder(root.left) + [root.val] + inOrder(root.right)

    m = {}
    firstTree = inOrder(root1)

    for x in range(len(firstTree)):
        m[target - firstTree[x]] = x

    secondTree = inOrder(root2)

    for x in secondTree:
        if x in m:
            return True

    return False


root1 = TreeNode(0)
root1.left = TreeNode(-10)
root1.right = TreeNode(10)

root2 = TreeNode(5)
root2.left = TreeNode(1)
root2.right = TreeNode(7)
root2.left.left = TreeNode(0)
root2.left.right = TreeNode(2)

print(twoSumBSTs(root1, root2, 18))
