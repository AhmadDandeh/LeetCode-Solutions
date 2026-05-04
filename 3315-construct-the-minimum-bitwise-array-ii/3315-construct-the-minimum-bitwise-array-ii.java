class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int num = nums.get(i);
            if((num&1) == 0) ans[i] = -1;
            else{
                int t = Integer.numberOfTrailingZeros(~num);
                long subtract = 1L << (t - 1);
                ans[i] = (int) (num - subtract);
            }
        }
        return ans;
    }
}