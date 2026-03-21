class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int  n = nums.length, left = 0, right = n-1;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            if(nums[i]<pivot) ans[left++] = nums[i];
            if(nums[n-i-1]> pivot) ans[right--] = nums[n-i-1];
        }

        for(int i = left; i<=right; i++){
            ans[i] = pivot;
        }
        return ans;
    }
}