class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] chars = new int[26];
        for(int i=0; i<26; i++) chars[order.charAt(i)-'a'] = i;
        Outer: for(int i=1; i<words.length; i++){
            int j = 0, k =0;
            int n1 = words[i-1].length();
            int n2 = words[i].length();
            while(j<n1 && k<n2){
                int prev = chars[words[i-1].charAt(j) - 'a'];
                int curr = chars[words[i].charAt(k) - 'a'];
                if(prev < curr) continue Outer;
                else if(prev > curr) return false;
                else{
                    j++;
                    k++;
                }
            }
            if(j<n1) return false;
        }
        return true;
    }
}