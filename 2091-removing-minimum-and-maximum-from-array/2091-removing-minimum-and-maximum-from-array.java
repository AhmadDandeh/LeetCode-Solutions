class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = 0, min = 0;
        for(int i=1; i<n; i++){
            if(nums[max]<nums[i]) max = i;
            if(nums[min]>nums[i]) min = i;
        }

        return Math.min(
            Math.max(min, max) + 1,
            Math.min(
                n - Math.min(max,min),
                Math.min(min, max) + 1 + n - Math.max(min, max)
            )
        );
    }
}