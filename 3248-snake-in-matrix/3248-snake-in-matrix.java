class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans =0;
        for(String s: commands){
            if(s.equals("UP")){
                ans -= n;
            }
            else if(s.equals("DOWN")){
                ans += n;
            }
            else if(s.equals("RIGHT")){
                ans++;
            }
            else{
                ans--;
            }
        }
        return ans;
    }
}