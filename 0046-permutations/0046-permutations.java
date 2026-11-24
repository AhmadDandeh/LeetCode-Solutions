class Solution {
    List<List<Integer>> ans;
    boolean[] visited;
    int n;
    List<Integer> path;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        n = nums.length;
        visited = new boolean[n];
        path = new ArrayList<>();
        for(int i=0; i<n; i++) backtrack(nums, i);
        return ans;
    }

    private void backtrack(int[] nums, int index){
        path.add(nums[index]);
        visited[index] = true;
        if(path.size() == n) ans.add(new ArrayList<>(path));
        else{
            for(int i=0; i<n; i++){
                if(!visited[i]) backtrack(nums, i);
            }
        }        
        visited[index] = false;
        path.remove(path.size()-1);
    }
}