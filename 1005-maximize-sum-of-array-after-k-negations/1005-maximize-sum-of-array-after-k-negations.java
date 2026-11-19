class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int sum = 0;
        while(i<nums.length && k>0){
            if(nums[i]>0) break;
            sum += Math.abs(nums[i++]);
            k--;
        }
        if((k&1)==1){
            if(i == 0) sum -= nums[i++];
            else if(i == nums.length) sum += 2*nums[i-1];
            else{
                if(Math.abs(nums[i-1])<nums[i]) sum += 2*nums[i-1];
                else sum -= nums[i++];
            }
        }
        for(; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}