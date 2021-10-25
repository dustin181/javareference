from typing import Optional
from typing import List

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def __repr__(self):
        return str(self.val)


def isSymmetric(root: Optional[TreeNode]) -> bool:
    if root is None:
        return False

    queue = [root, root]

    while queue:
        node1 = queue.pop(0)
        node2 = queue.pop(0)

        if node1 is None and node2 is None:
            continue
        if node1 is None or node2 is None:
            return False
        if node1.val != node2.val:
            return False

        queue.append(node1.left)
        queue.append(node2.right)
        queue.append(node1.right)
        queue.append(node2.left)

    return True


# root = [1,2,2,3,4,4,3]

root = TreeNode(1)
root.left = TreeNode(2)
root.left.left = TreeNode(3)
root.left.right = TreeNode(4)
root.right = TreeNode(2)
root.right.right = TreeNode(3)
root.right.left = TreeNode(4)
print(isSymmetric(root))
