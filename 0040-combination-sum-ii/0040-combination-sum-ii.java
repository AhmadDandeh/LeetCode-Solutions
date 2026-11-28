class Solution {
    List<List<Integer>> ans;
    List<Integer> path;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0);
        return ans;
    }

    private void backtrack(int[] candidates, int target, int start, int sum){
        if(sum == target){
            ans.add(new ArrayList<>(path));
            return;
        }
        else if(sum > target) return;

        for(int i = start; i<candidates.length; i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            backtrack(candidates, target, i+1, sum + candidates[i]);
            path.remove(path.size()-1);
        }
    }
}