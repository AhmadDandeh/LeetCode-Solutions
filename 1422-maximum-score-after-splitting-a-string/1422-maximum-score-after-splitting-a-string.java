class Solution {
    public int maxScore(String s) {
        int sLen = s.length();
        int[] prefix = new int[sLen+1];
        for(int i =1; i<= sLen; i++){
            prefix[i] = prefix[i-1];
            if(s.charAt(i-1) == '1'){
                prefix[i]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=1; i<sLen; i++){
            int res = prefix[sLen] - 2*prefix[i] + i;
            if(max<res) max = res;
        }
        return max;
    }
}