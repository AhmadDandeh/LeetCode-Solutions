class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] split = paragraph.toLowerCase()
                                  .replaceAll("[^a-z]", " ")
                                  .trim()
                                  .split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String b: banned) set.add(b);
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: split){
            if(!set.contains(s)) map.put(s, map.getOrDefault(s, 0)+1);
        }
        String result = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}