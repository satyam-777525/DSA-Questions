class Solution {

    int moves = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }

    public int dfs(TreeNode root) {

        // Empty subtree
        if (root == null) {
            return 0;
        }

        // Pehle left subtree
        int left = dfs(root.left);

        // Phir right subtree
        int right = dfs(root.right);

        // Left aur right subtree se coins transfer karne padenge
        moves += Math.abs(left);
        moves += Math.abs(right);

        // Current subtree ka balance
        return root.val + left + right - 1;
    }
}