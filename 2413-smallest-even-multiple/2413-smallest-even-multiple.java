class Solution {
    public int smallestEvenMultiple(int n) {
        return n << (n & 1);
        // return n%2 == 0? n:n*2;
    }
}