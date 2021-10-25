from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def __repr__(self):
        return str(self.val)


def insertIntoBST(root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
    if not root:
        return TreeNode(val)

    if val > root.val:
        # insert into the right subtree
        root.right = insertIntoBST(root.right, val)
    else:
        # insert into the left subtree
        root.left = insertIntoBST(root.left, val)
    return root


root = TreeNode(4)
insertIntoBST(root, 2)
insertIntoBST(root, 3)
insertIntoBST(root, 1)
insertIntoBST(root, 7)
print("")