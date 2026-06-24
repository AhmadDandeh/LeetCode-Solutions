class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int q = queries.length;
        int[] ans = new int[q];
        if(q == 1) return ans;
        
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i<q; i++){
            int index = queries[i][0];
            int cur = queries[i][1];
            int prev = arr[index];
            if(prev>0){
                if(index>0 && prev == arr[index-1]) count--;
                if(index<n-1 && prev == arr[index+1]) count--;
            }
            if(index>0 && cur == arr[index-1]) count++;
            if(index<n-1 && cur == arr[index+1]) count++;
            arr[index] = cur;
            ans[i] = count;            
        }
        return ans;
    }
}