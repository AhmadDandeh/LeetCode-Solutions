class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = n * (n+1) /2;
        int noDm = n/m;
        int num2 = m * noDm * (noDm+1)/2;
        return num1 - 2*num2;    
    }
}