class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int left = 0;
        char prev = s.charAt(0);

        for(int i =1; i<= s.length(); i++){
            if(i == s.length() || s.charAt(i) != prev){
                if(i-left >= 3){
                    ans.add(Arrays.asList(new Integer[]{left, i-1}));
                }
                if (i < s.length()) {
                    prev = s.charAt(i);
                    left = i;
                }
            }
        }
        return ans;
    }
}