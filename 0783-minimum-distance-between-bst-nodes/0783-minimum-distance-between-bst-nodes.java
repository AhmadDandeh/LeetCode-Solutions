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
    int diff;
    int prev;
    public int minDiffInBST(TreeNode root) {
        diff = Integer.MAX_VALUE;
        prev = -1;
        inOrder(root);
        return diff;
    }

    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(prev != -1) diff = Math.min(diff, root.val - prev);
        prev = root.val;
        inOrder(root.right);
    }
}