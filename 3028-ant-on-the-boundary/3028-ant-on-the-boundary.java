class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int pos = 0, ans =0;
        for(int num: nums){
            pos += num;
            if(pos == 0) ans++;
        }
        return ans;
    }
}