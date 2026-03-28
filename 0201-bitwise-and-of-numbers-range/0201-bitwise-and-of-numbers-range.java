class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // and not xor
        int shifts = 0;
        while(left>0 && left != right){
            shifts++;
            left = left>>1;
            right = right>>1;
        }
        return left<<shifts;
    }
}