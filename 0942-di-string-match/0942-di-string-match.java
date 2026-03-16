class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length(), min = 0, max = n;
        int[] ans = new int[n+1];

        for(int i =0; i< n; i++){
            if(s.charAt(i) == 'I') ans[i] = min++;
            else ans[i] = max--;
        }
        ans[n] = max;
        return ans;
    }
}