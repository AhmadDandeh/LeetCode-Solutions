class Solution {
    public long maxScore(int[] nums) {
        if(nums.length == 1){
            return nums[0] * nums[0];
        }
        long ans = 0;
        
        for(int i =-1; i<nums.length; i++){
            long g, l;
            int j;
            long iAns;
            if(i == 0){
                j = 2;
                g = nums[1];
                l = nums[1];
            }
            else{
                j = 1;
                g = nums[0];
                l = nums[0];
            }

            for(; j<nums.length; j++){
                if(i == j){
                    continue;
                }
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);
            }
            if(g*l > ans){
                ans = g*l;
            }
        }
        return ans;
    }

        // GCD using Euclidean Algorithm
    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // ensure non-negative result
    }

    // LCM using GCD
    public long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0; // LCM of zero with anything is zero
        return Math.abs(a * (b / gcd(a, b))); // avoid overflow by dividing first
    }

}