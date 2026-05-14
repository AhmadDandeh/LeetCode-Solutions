class Solution {
    public int findLucky(int[] arr) {
        int[] rec = new int[501];
        for(int a:arr) rec[a]++;
        for(int i=rec.length-1; i>0; i--){
            if(rec[i] == i) return i;
        }
        return -1;
    }
}