class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return;
        k %= n;
        if(k == 0) return;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }

    private void reverse(int[] nums, int from, int to){
        while(from<to){
            int temp = nums[from];
            nums[from++] = nums[to];
            nums[to--] = temp;
        }
    }

}