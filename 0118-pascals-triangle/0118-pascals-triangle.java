class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[] arr = new int[numRows];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> subarr = new ArrayList<>();
            for(int j = i; j>=0; j--){
                if(j == 0 || j == i) arr[j] = 1;
                else arr[j] += arr[j-1];
            }
            
            for(int j=0; j<=i; j++) subarr.add(arr[j]);
            
            ans.add(subarr);
        }
        return ans;
    }
}