class Solution {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for(int num:nums){
            for(int i =0; i< 32; i++){
                count[i] += (num >> i) & 1;
            }
        }
        int ans = 0;
        for(int i =0;i< count.length; i++){
            if (count[i] % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return (int) ans;
    }
}