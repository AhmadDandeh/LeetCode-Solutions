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
    boolean big = false;
    public int findSecondMinimumValue(TreeNode root) {
        if(root.val == Integer.MAX_VALUE) return -1;
        int ans = find(root, root.val);
        return ans == Integer.MAX_VALUE && !big? -1:ans;
    }

    private int find(TreeNode root, int value){
        if(root.val == Integer.MAX_VALUE) big = true;
        if(root.left == null) return root.val > value ? root.val : Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE, r = Integer.MAX_VALUE;
        if(root.left.val == value) l = find(root.left, value);
        else{
            if(root.left.val == Integer.MAX_VALUE) big = true;
            l = root.left.val;
        }
        if(root.right.val == value) r = find(root.right, value);
        else{
            if(root.right.val == Integer.MAX_VALUE) big = true;
            r = root.right.val;
        }
        return Math.min(l, r);
    }
}