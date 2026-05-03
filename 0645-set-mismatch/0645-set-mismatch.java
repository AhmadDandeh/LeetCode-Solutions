class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] status = new boolean[nums.length];
        int[] ans = new int[2];
        for(int n:nums){
            if(status[n-1]) ans[0] = n;
            status[n-1] = true;
        }
        for(int i =0; i< nums.length; i++){
            if(!status[i]){
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
}