class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = new int[101];
        for(int h: heights){
            exp[h]++;
        }

        int ans = 0;
        int index = 0;
        for(int i=0; i<101; i++){
            while(exp[i]-->0){
                if(i != heights[index++]) ans++;
            }
        }

        return ans;
    }
}