from typing import Optional
from typing import List

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

    def __repr__(self):
        return str(self.val)


def lowestCommonAncestor(root: Optional[TreeNode], p: Optional[TreeNode], q: Optional[TreeNode]) -> 'TreeNode':
    if root is None:
        return None

    stack = [root]
    parent = {root: None}

    while p not in parent or q not in parent:
        node = stack.pop()

        if node.left:
            parent[node.left] = node
            stack.append(node.left)
        if node.right:
            parent[node.right] = node
            stack.append(node.right)

    ancestors = set()

    while p:
        ancestors.add(p)
        p = parent[p]

    while q not in ancestors:
        q = parent[q]

    return q




root = TreeNode(3)
root.left = TreeNode(5)
root.right = TreeNode(1)
root.left.left = TreeNode(6)
root.left.right = TreeNode(2)
root.right.left = TreeNode(0)
root.right.right = TreeNode(8)
root.left.right.left = TreeNode(7)
root.left.right.right = TreeNode(4)

#p = 7
#q = 6
print(lowestCommonAncestor(root, root.left.right.left, root.left.left))
