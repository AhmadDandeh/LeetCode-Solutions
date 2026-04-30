class Solution {
    public int findComplement(int num) {
        int x =num;
        if(num == 0){
            return 1;
        }

        x |= x>>1;
        x |= x>>2;
        x |= x>>4;
        x |= x>>8;
        x |= x>>16;

        return x^num;
    }
}