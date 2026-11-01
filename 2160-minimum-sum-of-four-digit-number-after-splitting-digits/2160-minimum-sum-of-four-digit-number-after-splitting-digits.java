class Solution {
    public int minimumSum(int num) {
        int n1 = num%10;
        num /= 10;
        int n2 = num%10;
        if(n2<n1){int temp = n1; n1 = n2; n2 = temp;}
        num /= 10;
        int n3 = num%10;
        if(n3<n1){int temp = n1; n1 = n3; n3 = n2; n2 = temp;}
        else if(n3<n2){int temp = n2; n2 = n3; n3=temp;}
        int first = n1*10+n3;
        num /= 10;
        int second = num<n2? num*10+n2: n2*10+num;
        return first + second;
    }
}