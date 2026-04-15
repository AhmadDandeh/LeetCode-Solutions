class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE, n = words.length;
        for(int i = 0; i<n; i++){
            if(words[i].equals(target)){
                int len = Math.abs(startIndex - i);
                ans = Math.min(ans, Math.min(len, n-len));
            }
        }
        return ans == Integer.MAX_VALUE? -1: ans;
    }
}