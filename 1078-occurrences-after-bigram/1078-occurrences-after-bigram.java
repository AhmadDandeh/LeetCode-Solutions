class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new ArrayList<>();
        String[] words = text.split(" ");
        for(int i =2; i<words.length; i++){
            if(words[i-2].equals(first) && words[i-1].equals(second)){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}