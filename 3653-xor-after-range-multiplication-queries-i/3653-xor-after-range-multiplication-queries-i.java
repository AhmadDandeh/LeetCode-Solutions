class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1_000_000_007;
        for(int[] q:queries){
            for(int i = q[0]; i<=q[1]; i+=q[2]){
                nums[i] = (int) ((1L * nums[i] * q[3]) % mod);
            }
        }
        int ans = 0;
        for(int n: nums) ans ^= n;
        return ans;
    }
}