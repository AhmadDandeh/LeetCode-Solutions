class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    public int reverse(int x){
        int ans = 0;
        while(x>0){
            ans = ans *10 + x%10;
            x/=10;
        }
        return ans;
    }
}