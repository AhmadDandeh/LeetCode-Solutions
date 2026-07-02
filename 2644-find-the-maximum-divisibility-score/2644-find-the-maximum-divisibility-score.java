class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxOcc = 0;
        int minNumber = Integer.MAX_VALUE;
        for(int d: divisors){
            int count = 0;
            for(int n:nums) if(n%d == 0) count++;
            if(maxOcc < count){
                maxOcc = count;
                minNumber = d;
            }
            else if(maxOcc == count) minNumber = Math.min(minNumber, d);
        }
        return minNumber;
    }
}