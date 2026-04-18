class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m<n) return "";
        // Hashing
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
            set.add(c);
        }

        // Sliding Window
        int left = 0;
        int min=-1, max =-1, diff = Integer.MAX_VALUE;

        for(int right = 0; right<m; right++){
            char cR = s.charAt(right);
            if(map.containsKey(cR)){
                map.put(cR, map.get(cR)-1);
                if(map.get(cR) <= 0) set.remove(cR);
            }

            while(set.isEmpty()){
                if(diff > right-left){
                    max = right;
                    min = left;
                    diff = max - min;
                }
                char cL = s.charAt(left);
                if(map.containsKey(cL)){
                    map.put(cL, map.get(cL)+1);
                    if(map.get(cL)>0) set.add(cL);
                }
                left++;
            }
        }
        
        return diff == Integer.MAX_VALUE? "": s.substring(min, max+1);
    }
}