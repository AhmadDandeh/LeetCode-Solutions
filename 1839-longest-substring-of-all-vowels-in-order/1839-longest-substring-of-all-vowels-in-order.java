class Solution {
    public int longestBeautifulSubstring(String word) {
        char[] vowels = new char[]{'a','a','e','i','o','u','u'};
        int p = 1, max =0, count =0;
        for(char c: word.toCharArray()){
            if(c == vowels[p]){
                count++;
                p++;
            }
            else if(c == vowels[p-1]) count++;
            else{
                count = c == 'a'? 1:0;
                p = c == 'a'? 2:1;
            }

            if(p >= 6){
                p=6;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}