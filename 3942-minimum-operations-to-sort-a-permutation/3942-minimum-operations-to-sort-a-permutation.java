class Solution {
    public int minOperations(int[] nums) {
        int index = 0, len = nums.length, diff = nums[0]<nums[len-1]? 1:0;
        if(len == 1) return 0;
        if(len == 2) return diff == 1? 0:1;
        for(int i = 1; i < len; i++){
            if(nums[i] == 0){
                index = i;
            }
            if(nums[i] < nums[i-1]) diff++;
        }

        if(nums[(index - 1 + len)%len] > nums[(index + 1)% len]){
            // ascending
            if(diff > 1) return -1;
            return Math.min(index, 2 + len - index);
        }
        else{
            // decending
            if(len - diff > 1) return -1;
            return Math.min(index + 2, len - index);
        }
    }
}