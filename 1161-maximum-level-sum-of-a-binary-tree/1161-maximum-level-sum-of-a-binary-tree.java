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
    public int maxLevelSum(TreeNode root) {
        int maxLevel = 1;
        int max = root.val;
        int level = 2;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if(root.left != null) queue.addLast(root.left);
        if(root.right != null) queue.addLast(root.right); 
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for(int i =0; i< size; i++){
                TreeNode curr = queue.removeFirst();
                sum += curr.val;
                if(curr.left != null) queue.addLast(curr.left);
                if(curr.right != null) queue.addLast(curr.right); 
            }
            
            if(sum > max){
                max = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
}