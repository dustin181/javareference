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


def zigzagLevelOrder(root: Optional[TreeNode]) -> List[List[int]]:

    if root is None:
        return []

    queue = [root]
    levels = []
    direction = True

    while queue:

        level = []

        for i in range(len(queue)):
            node = queue.pop(0)
            level.append(node.val)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        if not direction:
            level.reverse()

        levels.append(level)
        direction = not direction

    return levels


root = TreeNode(3)
root.left = TreeNode(9)
root.right = TreeNode(20)
root.right.left = TreeNode(15)
root.right.right = TreeNode(7)

print(zigzagLevelOrder(root))

