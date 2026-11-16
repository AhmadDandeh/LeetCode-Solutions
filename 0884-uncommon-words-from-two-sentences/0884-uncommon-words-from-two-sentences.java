class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        int count = 0;
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for(String w: s1.split(" ")){
            if(!set2.contains(w)){
                if(set1.contains(w)){
                    set1.remove(w);
                    set2.add(w);
                }
                else set1.add(w);
            }
        }
        for(String w: s2.split(" ")){
            if(!set2.contains(w)){
                if(set1.contains(w)){
                    set1.remove(w);
                    set2.add(w);
                }
                else set1.add(w);
            }
        }
        String[] ans = new String[set1.size()];
        int i = 0;
        for(String s:set1) ans[i++] = s;
        return ans;
    }
}