class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans =0;
        for(String s:sentences){
            ans = Math.max(ans, s.split(" ").length);
        }
        return ans;
    }
}