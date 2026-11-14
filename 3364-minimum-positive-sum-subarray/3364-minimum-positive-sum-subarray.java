class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size(), ans = Integer.MAX_VALUE;
        int[] pre = new int[n+1];
        pre[0] = 0;
        for(int i =0; i<n; i++) pre[i+1] = pre[i] + nums.get(i);
        for(int i = l; i <= r; i++){
            for(int j = i; j<=n; j++){
                int sum = pre[j] - pre[j - i];
                if(sum >0) ans = Math.min(ans, sum);
                if(ans == 1) return 1;
            }
        }
        return ans == Integer.MAX_VALUE? -1:ans;
    }
}