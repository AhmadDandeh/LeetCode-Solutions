class Solution {
    public int bitwiseComplement(int n) {
        int x = n;
        if(x <= 0) return 1;
	    
	    x |= x >> 1;
	    x |= x >> 2;
	    x |= x >> 4;
	    x |= x >> 8;
	    x |= x >> 16;
	    return x ^ n;
    }
}