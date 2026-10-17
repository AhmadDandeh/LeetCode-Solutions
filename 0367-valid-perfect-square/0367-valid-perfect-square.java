class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, h = num;
        while(l <= h){
            int mid = l + (h-l)/2;
            long x = (long) mid * mid;
            if(x == num) return true;
            else if(x < num) l = mid + 1;
            else h = mid - 1;
        }
        return false;
    }
}