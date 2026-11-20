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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.addLast(root);
        while(!dq.isEmpty()){
            int size = dq.size();
            double sum = 0;
            for(int i=0; i<size; i++){
                TreeNode t = dq.removeFirst();
                sum += t.val;
                if(t.left != null) dq.addLast(t.left);
                if(t.right != null) dq.addLast(t.right);
            }
            ans.add(sum/size);
        }
        return ans;
    }
}