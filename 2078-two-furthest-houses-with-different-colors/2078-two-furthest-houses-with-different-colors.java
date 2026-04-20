class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length, max = (n+1)/2;
        if(colors[0] != colors[n-1]) return n-1;
        for(int l =1; l<max; l++){
            int r = n-1-l;
            if(colors[l] != colors[0] || colors[0] != colors[r]){
                return r;
            }
        }
        return 0;
    }
}