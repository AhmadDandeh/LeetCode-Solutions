class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length, eP = 0, oP = 1;
        int[] ans = new int[n];
        for(int num:nums){
            if((num&1)==0){
                ans[eP] = num;
                eP += 2;
            }
            else{
                ans[oP] = num;
                oP += 2;
            }
        }
        return ans;
    }
}