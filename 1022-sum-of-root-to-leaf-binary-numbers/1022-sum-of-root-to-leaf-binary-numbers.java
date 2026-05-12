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
    public int sumRootToLeaf(TreeNode root) {
        return DFS(root, 0);
    }

    private int DFS(TreeNode root, int sum){
        if(root == null) return 0;
        sum = (sum << 1) | root.val;
        if(root.right == null && root.left == null){
            return sum;
        }
        return DFS(root.left, sum) + DFS(root.right, sum);
    }
}