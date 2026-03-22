class Solution {
    public int minPartitions(String n) {
        char ans = '0';
        for(char c: n.toCharArray()){
            if(c>ans) ans = c;
        }
        return ans - '0';
    }
}