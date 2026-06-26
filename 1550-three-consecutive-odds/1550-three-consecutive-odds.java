class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        while(i<arr.length-2){
            if((arr[i]&1) == 1){
                if((arr[i+1]&1) == 1){
                    if((arr[i+2]&1) == 1) return true;
                    else i += 3;
                }
                else i += 2;
            }
            else i++;
        }
        return false;
    }
}