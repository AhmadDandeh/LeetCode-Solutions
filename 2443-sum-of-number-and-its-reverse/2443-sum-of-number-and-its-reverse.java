class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num == 0) return true;
        int m = num/2;
        for(int i =num; i>=m; i--) if(i + reverse(i) == num) return true;
        return false;
    }

    public int reverse(int num){
        int ans = 0;
        while(num>0){
            ans = ans *10 + num%10;
            num/=10;
        }
        return ans;
    }
}