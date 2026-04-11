class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String ss = new String(c);
            map.computeIfAbsent(ss, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}