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
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root){
        if(root == null) return 0;
        int left = checkHeight(root.left);
        if(left == -1) return -1;
        int right = checkHeight(root.right);
        if(right == -1) return -1;
        if(Math.abs(right - left) > 1) return -1;
        else return Math.max(right, left) + 1;
    }
}