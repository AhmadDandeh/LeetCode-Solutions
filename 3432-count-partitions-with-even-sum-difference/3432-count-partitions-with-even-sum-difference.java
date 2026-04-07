class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int n:nums) sum += n;
        return ((sum & 1) == 0)? nums.length-1:0;
    }
}