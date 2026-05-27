class Solution {
    public int numberOfSpecialChars(String word) {
        int[] state = new int[26];
        int n = word.length();
        for(int i=0; i<n; i++){
            char c = word.charAt(i);
            if(c>='A' && c<='Z'){
                int index = c-'A';
                if(state[index] == 0) state[index] = 3;
                else if(state[index] == 1) state[index] = 2;
            }
            else{
                int index = c -'a';
                if(state[index] == 0) state[index] = 1;
                else if(state[index] == 2) state[index] = 3;
            }
        }
        int ans = 0;
        for(int i=0; i<26; i++){
            if(state[i] == 2) ans++;
        }
        return ans;
    }
}