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
    int count, maxCount;
    TreeNode prev;
    List<Integer> modes;
    public int[] findMode(TreeNode root) {
        count = 0;
        maxCount = 0;
        prev = null;
        modes = new ArrayList<>();
        inOrder(root);
        return modes.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }

    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(prev != null){
            if(root.val == prev.val) count++;
            else count = 1;
        }
        else count = 1;
        if(count == maxCount) modes.add(root.val);
        else if(count > maxCount){
            maxCount = count;
            modes.clear();
            modes.add(root.val);
        }
        prev = root;
        inOrder(root.right);
    }
}