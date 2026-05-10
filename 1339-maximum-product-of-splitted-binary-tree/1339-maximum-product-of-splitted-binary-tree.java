/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private static final long MOD = 1_000_000_007L;
    private long total;
    private long best;

    public int maxProduct(TreeNode root) {
        total = sum(root);
        best = 0;
        dfs(root);
        return (int)(best % MOD);
    }

    private long sum(TreeNode n) {
        if (n == null) return 0;
        return n.val + sum(n.left) + sum(n.right);
    }

    private long dfs(TreeNode n) {
        if (n == null) return 0;
        long s = n.val + dfs(n.left) + dfs(n.right);
        best = Math.max(best, s * (total - s));
        return s;
    }
}