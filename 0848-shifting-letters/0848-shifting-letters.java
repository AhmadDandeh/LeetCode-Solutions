class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        shifts[n-1] %= 26;
        for(int i = n-2; i>-1; i--){
            shifts[i] = (shifts[i] + shifts[i+1])%26;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            sb.append((char)(((s.charAt(i) - 'a' + shifts[i])%26)+'a'));
        }
        return sb.toString();
    }
}