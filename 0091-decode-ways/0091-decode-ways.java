class Solution {
    // Tabulation
    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        int p1 = 1, p2 = 1, p3 = 0, n = s.length();
        for(int i =1; i<n; i++){
            p3 = 0;
            if(s.charAt(i) != '0') p3 += p2;
            if(isValid((s.charAt(i-1) - '0') * 10 + (s.charAt(i) - '0'))) p3 += p1;
            if(p3 == 0) return 0;
            p1 = p2;
            p2 = p3;
        }
        return p2;
    }

    private boolean isValid(int x){
        return x>9 && x<27;
    }

    /*
    // Normal recursion
    public int numDecodings(String s) {
        return rec(s, 0);
    }

    private int rec(String s, int index){
        if(index == s.length()) return 1;
        if(s.charAt(index) == '0') return 0;
        
        int result = rec(s, index+1);

        if(index+1<s.length() && isValid(Integer.parseInt(s.substring(index, index+2)))){
            result += rec(s, index+2);
        }
        return result;
    }
    */
    /*
    // Memo
    int[] memo;
    public int numDecodings(String s) {
        memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return rec(s, 0);
    }

    private int rec(String s, int index){
        if(index == s.length()) return 1;
        if(s.charAt(index) == '0') return 0;
        
        if(memo[index] != -1) return memo[index];
        
        int result = rec(s, index+1);

        if(index+1<s.length() && isValid(Integer.parseInt(s.substring(index, index+2)))){
            result += rec(s, index+2);
        }
        memo[index] = result;
        return memo[index];
    }
    */


    
}