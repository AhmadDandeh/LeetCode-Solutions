class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        int sL = s.length();
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        for(int i = 0; i<sL; i++){
            int index = s.charAt(i) - 'a';
            if(first[index] == -1) first[index] = i; // first
            last[index] = i;
        }
        int ans = 0;
        for(int i =0; i<26; i++){
            if(first[i] != -1 && last[i] != -1 && first[i] < last[i]-1){
                boolean[] seen = new boolean[26];
                int count = 0;
                for(int j = first[i]+1; j<last[i]; j++){
                    int mid = s.charAt(j) - 'a';
                    if (!seen[mid]) {
                        seen[mid] = true;
                        count++;
                    }
                }
                ans += count;
            }
        }
        return ans;
    }
}