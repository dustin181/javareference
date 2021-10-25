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


def levelOrder(root: Optional[TreeNode]) -> List[List[int]]:
    if root is None:
        return []

    levels = []
    queue = [root]

    while queue:

        level = []

        for i in range(len(queue)):
            node = queue.pop(0)
            level.append(node.val)

            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        levels.append(level)

    return levels






root = TreeNode(3)
root.left = TreeNode(9)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)
root.right = TreeNode(20)
root.right.left = TreeNode(15)
root.right.right = TreeNode(7)

print(levelOrder(root))

