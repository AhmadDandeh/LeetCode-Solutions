class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> helper = new ArrayDeque<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, target, 0, 0);
        return ans;
    }
    
    public void backtracking(int[] candidates, int target, int sum, int index){
        for(int i = index; i< candidates.length; i++){
            if(sum + candidates[i] > target) continue;
            else{
                helper.addLast(candidates[i]);
                sum += candidates[i];
                if(sum == target) ans.add(new ArrayList<>(helper));
                else backtracking(candidates, target, sum, i);
                sum -= helper.removeLast();
            }
        }
    }
}