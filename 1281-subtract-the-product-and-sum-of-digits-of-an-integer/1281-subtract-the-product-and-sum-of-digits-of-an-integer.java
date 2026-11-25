class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, pro = 1;
        while(n>0){
            int d = n%10;
            sum += d;
            pro *= d;
            n/=10;
        }
        return pro - sum;
    }
}