class Solution {
    public int findMiddleIndex(int[] nums) {
        long post = 0, prev = 0;
        for(int i=0; i<nums.length; i++) post += nums[i];

        for(int i=0; i<nums.length; i++){
            post -= nums[i];
            if(post == prev) return i;
            prev += nums[i];
        }
        return -1;
    }
}