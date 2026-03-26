class Solution {
    public int countKeyChanges(String s) {
        int ans  = 0;
        char prev = Character.toLowerCase(s.charAt(0));
        for(char c: s.toLowerCase().toCharArray()){
            if(c != prev) ans++;
            prev = c;
        }
        return ans;
    }
}