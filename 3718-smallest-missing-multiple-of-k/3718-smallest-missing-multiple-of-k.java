class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] seen = new boolean[101];
        for(int n:nums) seen[n] = true;
        int i =k;
        for(; i<=100; i+=k){
            if(!seen[i]) break;
        }
        return i;
    }
}