class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int len = strs[0].length();
        for(int i=0; i<len; i++){
            char prev = strs[0].charAt(i);
            for(int j = 1; j<strs.length; j++){
                char cur = strs[j].charAt(i);
                if(cur<prev){
                    ans++;
                    break;
                }
                else prev = cur;
            }
        }
        return ans;
    }
}