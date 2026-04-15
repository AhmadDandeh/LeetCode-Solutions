class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums){
            xor^= num;
        }

        int i =0;
        while(((xor >> i) & 1) == 0) i++;

        int num1 = 0, num2 = 0;
        int sig = 1 << i;
        for(int num:nums){
            if((num & sig) == 0) num1 ^= num;
            else num2 ^= num;
        }
        return new int[]{num1, num2};
    }
}