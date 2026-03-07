class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int pointer = 0;
        int i =0;
        while(i< g.length && pointer<s.length){
            if(g[i]<=s[pointer]) i++;
            pointer++;
        }
        return i;
    }
}