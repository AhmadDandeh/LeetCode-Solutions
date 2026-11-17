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
    int prev = -1;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {       
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode node){
        if(node == null) return;
        inOrder(node.left);
        if(prev != -1) ans = Math.min(ans, node.val - prev);
        prev = node.val;
        inOrder(node.right);
    }
}