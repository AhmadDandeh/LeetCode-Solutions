class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans = 0;
        int len = colors.length;
        for(int i = 0; i< len; i++){
            if(colors[i] == colors[(i+2)%len] && colors[i] != colors[(i+1)%len]){
                ans++;
            }
        }
        return ans;
    }
}