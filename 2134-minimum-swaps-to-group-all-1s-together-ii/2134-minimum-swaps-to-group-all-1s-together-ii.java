class Solution {
    public int minSwaps(int[] nums) {
        int windowSize = 0;
        int n = nums.length;

        for(int num:nums){
            if(num == 1){
                windowSize++;
            }
        }

        if(windowSize<2){
            return 0;
        }

        int minSwaps = 0;
        for(int i =0; i<windowSize; i++){
            if(nums[i] == 0){
                minSwaps++;
            }
        }

        int ans = minSwaps;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == 0){
                minSwaps--;
            }
            if (nums[(i + windowSize - 1) % n] == 0){
                minSwaps++;
            }
            ans = Math.min(minSwaps, ans);
            if (ans == 0) break;
        }
        return ans;
    }
}