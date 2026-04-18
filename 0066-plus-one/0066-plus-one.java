class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        digits[i] = (digits[i]+1)%10;
        i--;
        while(i>=0 && digits[i+1] == 0){
            digits[i] = (digits[i]+1)%10;
            i--;
        }
        if(digits[0] == 0){
            int[] helper = new int[digits.length+1];
            helper[0] = 1;
            return helper;
        }
        else return digits;
    }
}