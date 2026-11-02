class Solution {
    public int numTimesAllBlue(int[] flips) {
        int ans = 0;
        int maxPos = 0;
        for(int i=0; i<flips.length; i++){
            maxPos = Math.max(maxPos, flips[i]);
            if(i+1 == maxPos) ans++;
        }
        return ans;
    }
}