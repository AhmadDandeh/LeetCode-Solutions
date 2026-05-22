class Solution {
    public long[] sumOfThree(long num) {
        if(num%3 != 0) return new long[]{};
        num /=3;
        return new long[]{num-1, num, num+1};
    }
}