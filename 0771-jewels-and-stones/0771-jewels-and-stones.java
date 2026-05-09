class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jew = new HashSet<>();
        for(char c: jewels.toCharArray()){
            jew.add(c);
        }

        int ans =0;
        for(char c: stones.toCharArray()){
            if(jew.contains(c)) ans++;
        }
        return ans;
    }
}