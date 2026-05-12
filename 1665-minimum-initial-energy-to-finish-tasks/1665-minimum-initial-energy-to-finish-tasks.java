class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1]-b[0]) - (a[1]-a[0]));
        int ans = 0;
        int cap = 0;
        for(int[] t:tasks){
            if(t[1]>cap){
                ans += (t[1] - cap);
                cap = t[1];
            }
            cap -= t[0];
        }
        return ans;
    }
}