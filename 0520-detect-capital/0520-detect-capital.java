class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int cap = 0;
        for(int i =0; i<n; i++){
            if(Character.isUpperCase(word.charAt(i))) cap++;
        }
        return (cap == 0 || cap == n || (cap == 1 && Character.isUpperCase(word.charAt(0))));
    }
}