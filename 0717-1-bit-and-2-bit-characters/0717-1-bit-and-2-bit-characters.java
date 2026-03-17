class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if(n == 1) return true;
        int i =0;
        while(i<n-1){
            if(bits[i] == 1) i += 2;
            else i++;
        }
        return i != n;
    }
}