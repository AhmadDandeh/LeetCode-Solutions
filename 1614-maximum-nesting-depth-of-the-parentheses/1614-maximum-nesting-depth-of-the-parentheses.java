class Solution {
    public int maxDepth(String s) {
        int max = 0, depth =0;
        for(char c: s.toCharArray()){
            if(c == '(') max = Math.max(max, ++depth);
            else if(c == ')') depth--;
        }
        return max;
    }
}