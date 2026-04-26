class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        int n = pattern.length();
        if(n != split.length) return false;
        HashSet<String> set = new HashSet<>();
        String[] p = new String[26];
        for(int i =0; i<n; i++){
            int index = pattern.charAt(i) - 'a';
            if(p[index] == null){
                if(set.contains(split[i])) return false;
                p[index] = split[i];
                set.add(split[i]);
            }
            else if(!split[i].equals(p[index])) return false;
        }
        return true;
    }
}