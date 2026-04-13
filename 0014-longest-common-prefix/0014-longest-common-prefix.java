class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxIndex = strs[0].length();
        for(int i = 1; i< strs.length && maxIndex>0; i++){
            int index = 0;
            for(; index< strs[i].length() && index<maxIndex; index++){
                if(strs[i].charAt(index) != strs[0].charAt(index)) break;
            }
            maxIndex = index;
        }
        return strs[0].substring(0, maxIndex);
    }
}