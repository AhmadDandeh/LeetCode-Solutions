class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int j =0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i< s.length(); i++){
            while(!set.add(s.charAt(i))){
                set.remove(s.charAt(j++));
            }
            if(set.size()> ans){
                ans = set.size();
            }
        }
        return ans;
    }
}