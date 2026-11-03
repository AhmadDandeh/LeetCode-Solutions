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
    private TreeNode prev = null;
    private TreeNode head = null;

    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        return head;
    }

    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        
        if(head == null) head = root;
        else prev.right = root;
        root.left = null;
        prev = root;
        
        inOrder(root.right);
    }
}