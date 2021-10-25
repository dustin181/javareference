from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def __repr__(self):
        return str(self.val)


def maxDepth(root: Optional[TreeNode]) -> int:
    if root is None:
        return 0

    queue = [root]
    depth = 0

    while queue:
        depth += 1

        for i in range(len(queue)):
            node = queue.pop(0)

            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

    return depth


root = TreeNode(3)
root.left = TreeNode(9)
root.left.left = TreeNode(17)
root.left.right = TreeNode(22)
root.right = TreeNode(20)
root.right.left = TreeNode(15)
root.right.right = TreeNode(7)
root.right.right.right = TreeNode(8)

print(maxDepth(root))

root2 = TreeNode(1)
root2.left = TreeNode(2)
root2.right = TreeNode(3)

print(maxDepth(root2))