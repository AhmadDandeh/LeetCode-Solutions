class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length-1;
        int[] ans = new int[n+1];
        int right = n, left =0;
        while(left<=right){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                ans[n--] = nums[left]*nums[left];
                left++;
            }
            else{
                ans[n--] = nums[right]*nums[right];
                right--;
            }
        }
        return ans;
    }
}