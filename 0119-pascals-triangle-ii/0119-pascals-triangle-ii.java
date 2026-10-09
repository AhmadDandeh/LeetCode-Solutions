class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>(rowIndex+1);
        ans.add(1);
        long prev = 1;
        for(int i = 1; i<=rowIndex; i++){
            prev = prev * (rowIndex - i + 1) /i;
            ans.add((int) prev);
        }
        return ans;
    }
}