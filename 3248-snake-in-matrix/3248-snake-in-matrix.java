class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans =0;
        for(String s: commands){
            if(s.charAt(0) == 'U'){
                ans -= n;
            }
            else if(s.charAt(0) == 'D'){
                ans += n;
            }
            else if(s.charAt(0) == 'R'){
                ans++;
            }
            else{
                ans--;
            }
        }
        return ans;
    }
}