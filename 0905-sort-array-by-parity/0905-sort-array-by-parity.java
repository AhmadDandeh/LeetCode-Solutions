class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length, eP = 0, oP = n-1;
        int[] ans = new int[n];
        for(int num:nums){
            if((num&1)==0) ans[eP++] = num;
            else ans[oP--] = num;
        }
        return ans;
    }
}