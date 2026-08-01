class Solution {
    public String winningPlayer(int x, int y) {
        return (Math.min(x, y/4) & 1) == 1? "Alice":"Bob";
    }
}