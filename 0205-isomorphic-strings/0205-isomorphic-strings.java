class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1) != c2) return false;
            }
            else{
                if(set.contains(c2)) return false;
                else{
                    map.put(c1, c2);
                    set.add(c2);
                }
            }
        }
        return true;
    }
}