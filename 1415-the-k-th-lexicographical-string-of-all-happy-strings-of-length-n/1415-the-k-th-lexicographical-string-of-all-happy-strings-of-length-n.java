class Solution {
    private char[] letters = new char[]{'a', 'b', 'c'};
    private char[] word;
    private int instances;
    public String getHappyString(int n, int k) {
        word = new char[n];
        instances = k;
        return buildString(n, 0, -1)? String.valueOf(word): "";
    }

    private boolean buildString(int n, int level, int index){
        if(level == n){
            instances--;
            return instances == 0;
        }
        for(int i = 0; i<3; i++){
            if(i == index) continue;
            word[level] = letters[i];
            if(buildString(n, level+1, i)) return true;
        }
        return false;
    }
}