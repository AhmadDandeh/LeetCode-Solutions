/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Node> dq = new ArrayDeque<>();
        if(root != null) dq.addLast(root);
        while(!dq.isEmpty()){
            int levelSize  = dq.size();
            List<Integer> li = new ArrayList<>(levelSize);
            while(levelSize-- > 0){
                Node v = dq.removeFirst(); 
                li.add(v.val);
                for(Node u: v.children) dq.addLast(u);
            }
            ans.add(li);
        }
        return ans;
    }
}