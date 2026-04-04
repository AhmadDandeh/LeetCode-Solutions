class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>(n);
        for(int i=1; i<n; i++){
            int diff = arr[i] - arr[i-1];
            if(diff == min) ans.add(Arrays.asList(arr[i-1], arr[i]));
            else if(diff < min){
                ans.clear();
                ans.add(Arrays.asList(arr[i-1], arr[i]));
                min = diff;
            }
        }
        return ans;
    }
}