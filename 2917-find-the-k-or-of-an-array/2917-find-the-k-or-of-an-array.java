class Solution {
    public int findKOr(int[] nums, int k) {
        int[] count = new int[32];
        for(int num: nums){
            int index = 0;
            while(num != 0){
                count[index] += (num & 1);
                num /= 2;
                index++;
            }
        }

        int ans = 0;
        for(int i = 0; i<32; i++){
            if(count[i] >= k){
                ans += (int) (Math.pow(2, i));
            }
        }
        return ans;
    }
}