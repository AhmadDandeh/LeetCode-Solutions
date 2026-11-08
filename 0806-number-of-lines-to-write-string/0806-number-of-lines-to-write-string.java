class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] ans = new int[2];
        int n = s.length(), sum = 0;
        ans[0] = 1;
        for(int i=0; i<n; i++){
            int x = widths[s.charAt(i) - 'a'];
            sum += x;
            if(sum > 100){
                sum = x;
                ans[0]++;
            }
        }
        ans[1] = sum;
        return ans;
    }
}