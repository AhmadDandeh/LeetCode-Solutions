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
    record Info(int depth, TreeNode subtree){}

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).subtree;
    }

    private Info dfs(TreeNode node) {
        if (node == null) return new Info(0, null);

        Info left = dfs(node.left);
        Info right = dfs(node.right);

        if (left.depth == right.depth) {
            return new Info(left.depth + 1, node);
        } else if (left.depth > right.depth) {
            return new Info(left.depth + 1, left.subtree);
        } else {
            return new Info(right.depth + 1, right.subtree);
        }
    }
}