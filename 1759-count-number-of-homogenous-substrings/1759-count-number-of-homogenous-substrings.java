class Solution {
    public int countHomogenous(String s) {
        long ans = 0, count = 0; 
        int n =s.length();
        char prev = s.charAt(0);

        for(int i=0; i<n; i++){
            if(s.charAt(i) == prev) count++;
            else{
                prev = s.charAt(i);
                count = 1;
            }
            ans = (ans + count) % 1000000007;
        }
        return (int) ans;
    }
}