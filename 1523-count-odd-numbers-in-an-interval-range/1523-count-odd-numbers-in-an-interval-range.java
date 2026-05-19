class Solution {
    public int countOdds(int low, int high) {
        if((high&1) == 1) high++;
        if((low&1) == 1) low--;
        return (high-low)/2;
    }
}