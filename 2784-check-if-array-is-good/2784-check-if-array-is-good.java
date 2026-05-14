class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length, n = len-1;
        boolean[] visited = new boolean[len];
        for(int num:nums){
            if(num>n) return false;
            else if(num == n){
                if(visited[num-1]){
                    if(visited[num]) return false;
                    else visited[num] = true;
                }
                else visited[num-1] = true;
            }
            else{
                if(visited[num-1]) return false;
                else visited[num-1] = true;
            }
        }
        return true;
    }
}