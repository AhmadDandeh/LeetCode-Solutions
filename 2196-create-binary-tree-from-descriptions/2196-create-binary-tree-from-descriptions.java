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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> child = new HashSet<>();
        HashSet<Integer> parent = new HashSet<>();
        for(int[] d: descriptions){
            map.putIfAbsent(d[0], new TreeNode(d[0]));
            TreeNode p = map.get(d[0]);
            
            map.putIfAbsent(d[1], new TreeNode(d[1]));
            TreeNode c = map.get(d[1]);

            if(d[2] == 0) p.right = c;
            else p.left = c;

            child.add(c.val);
            parent.remove(c.val);

            if(!child.contains(p.val)) parent.add(p.val);
        }
        for(Integer t: parent) return map.get(t);
        return null;
    }
}