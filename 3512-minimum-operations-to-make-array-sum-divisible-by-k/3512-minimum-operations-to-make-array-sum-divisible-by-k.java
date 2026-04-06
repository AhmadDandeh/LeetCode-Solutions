class Solution {
    public int minOperations(int[] nums, int k) {
        if(k == 1) return 0;
        int sum = 0;
        for(int n:nums) sum += n;
        return sum%k;
    }
}