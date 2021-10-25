from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
    def __repr__(self):
        return str(self.val)

def preorder(root: Optional[TreeNode]) -> list:
    if root is None:
        return []

    return [root.val] + inorder(root.left) + inorder(root.right)


def postorder(root: Optional[TreeNode]) -> list:
    if root is None:
        return []

    return inorder(root.left) + inorder(root.right) + [root.val]


def inorder(root: Optional[TreeNode]) -> list:
    if root is None:
        return []

    return inorder(root.left) + [root.val] + inorder(root.right)


def kthSmallest(root: Optional[TreeNode], k: int) -> int:
    return inorder(root)[k - 1]


root1 = TreeNode(3)
root1.left = TreeNode(1)
root1.right = TreeNode(4)
root1.left.right = TreeNode(2)

root2 = TreeNode(5)
root2.left = TreeNode(3)
root2.right = TreeNode(6)
root2.left.left = TreeNode(2)
root2.left.right = TreeNode(4)
root2.left.left.left = TreeNode(1)

print(kthSmallest(root1, 1))
print(kthSmallest(root2, 3))

# print(inorder(root1))
# print(inorder(root2))
# print(preorder(root1))
# print(preorder(root2))
# print(postorder(root1))
# print(postorder(root2))
