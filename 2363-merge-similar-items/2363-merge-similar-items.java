class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] sum = new int[1001];
        for(int[] i:items1){
            sum[i[0]] = i[1];
        }
        for(int[] i:items2){
            sum[i[0]] += i[1];
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i<1001; i++){
            if(sum[i]>0){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(sum[i]);
                ans.add(l);
            }
        }
        return ans;
    }
}