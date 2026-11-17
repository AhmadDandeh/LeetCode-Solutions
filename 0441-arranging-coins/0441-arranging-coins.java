class Solution {
    public int arrangeCoins(int n) {
        int l = 1, h = n;
        while(l<=h){
            int mid = l + (h-l)/2;
            long sum = (long) (mid+1)*mid/2;
            if(sum>n) h = mid-1;
            else if(sum<n) l = mid+1;
            else return mid;
        }
        return l-1;
    }
}