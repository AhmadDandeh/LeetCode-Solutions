class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;
        while(num>0){
            if((num & 1) == 0){
                num /= 2;
            }
            else{
                num--;
            }
            ans++;
        }
        return ans;
    }
}