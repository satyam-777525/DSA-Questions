class Solution {
    public void delete1(TreeNode root, int target) {
        if (root == null) return;

        if (root.val > target) { // go left
            if (root.left == null) return;
            if (root.left.val == target) {
                TreeNode child = root.left;

                // 0 children
                if (child.left == null && child.right == null) {
                    root.left = null;
                }
                // 1 child
                else if (child.left == null || child.right == null) {
                    if (child.left != null) root.left = child.left;
                    else root.left = child.right;
                }
                // 2 children
               else {
    TreeNode parent = child;
    TreeNode curr = child.right;

    while (curr.left != null) {
        parent = curr;
        curr = curr.left;
    }

    child.val = curr.val;

    if (parent == child)
        parent.right = curr.right;
    else
        parent.left = curr.right;
}
            } else delete1(root.left, target);
        }

        else if (root.val < target) { // go right
            if (root.right == null) return;
            if (root.right.val == target) {
                TreeNode child = root.right;

                // 0 children
                if (child.left == null && child.right == null) {
                    root.right = null;
                }
                // 1 child
                else if (child.left == null || child.right == null) {
                    if (child.left != null) root.right = child.left;
                    else root.right = child.right;
                }
                // 2 children
                else {
                    TreeNode parent = child;
                    TreeNode curr = child.right;

                    while (curr.left != null) {
                        parent = curr;
                        curr = curr.left;
                    }

                    child.val = curr.val;

                    if (parent == child)
                        parent.right = curr.right;
                    else
                        parent.left = curr.right;
                }
            } else delete1(root.right, target);
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;
        delete1(temp, key);   
        return temp.left;
    }
}
