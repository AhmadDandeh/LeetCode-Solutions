class Solution {
    List<List<Integer>> ans;
    List<Integer> path;

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        backtrack(nums, 0);
        return ans;
    }

    private void backtrack(int[] nums, int start) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    /**
     * Another approach as leafs of a tree
     */
    /*
    List<List<Integer>> ans;
    List<Integer> path;

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        backtrack(nums, 0);
        return ans;
    }

    private void backtrack(int[] nums, int index) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[index]);
        backtrack(nums, index + 1);
        path.remove(path.size() - 1);
        backtrack(nums, index + 1);
    }
    */
}