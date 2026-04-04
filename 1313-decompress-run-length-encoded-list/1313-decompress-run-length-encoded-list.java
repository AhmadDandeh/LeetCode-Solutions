class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for(int i = 0; i<nums.length; i += 2) length += nums[i];
        int[] ans = new int[length];
        int j = 0;
        for(int i = 0; i<nums.length; i+=2){
            while(nums[i]>0){
                ans[j++] = nums[i+1];
                nums[i]--;
            }
        }
        return ans;
    }
}