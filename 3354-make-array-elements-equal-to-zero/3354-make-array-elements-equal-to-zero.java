class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length, ans = 0;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        int[] postfix = new int[n];
        postfix[n-1] = nums[n-1];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i];
            postfix[n-1-i] = postfix[n-i]+nums[n-1-i];
        }
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                if(prefix[i] == postfix[i]) ans += 2;
                else if(Math.abs(prefix[i] - postfix[i]) == 1) ans++;
            }
        }
        return ans;
    }
}