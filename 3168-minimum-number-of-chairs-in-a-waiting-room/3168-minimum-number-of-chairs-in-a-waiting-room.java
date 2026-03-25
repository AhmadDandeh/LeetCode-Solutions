class Solution {
    public int minimumChairs(String s) {
        int max  = 0, count  = 0;
        for(char c: s.toCharArray()){
            if(c == 'E'){
                max = Math.max(max, ++count);
            }
            else count--;
        }
        return max;
    }
}