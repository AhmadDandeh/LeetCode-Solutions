class Solution {
    public int possibleStringCount(String word) {
        int ans =1;
        int n = word.length();
        int i =0;
        while(i< n){
            int j = i;
            while(j<n && word.charAt(i) == word.charAt(j)){
                j++;
            }
            if(j-i>1){
                ans += (j-i)-1;
            }
            i=j;
        }
        return ans;
    }
}