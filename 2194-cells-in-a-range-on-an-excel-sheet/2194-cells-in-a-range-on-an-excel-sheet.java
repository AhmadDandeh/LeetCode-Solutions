class Solution {
    public List<String> cellsInRange(String s) {
        char colS = s.charAt(0), colE = s.charAt(3);
        char rowS = s.charAt(1), rowE = s.charAt(4);

        List<String> ans = new ArrayList<>();
        for(char i = colS; i<= colE; i++){
            for(char j = rowS; j<= rowE; j++){
                ans.add(i+""+j);
            }
        }
        return ans;
    }
}