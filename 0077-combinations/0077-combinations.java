class Solution {
    List<List<Integer>> ans;
    List<Integer> path;

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        backtrack(1, n, k);
        return ans;
    }

    private void backtrack(int start, int n, int k) {
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n-k+path.size()+1; i++) {
            path.add(i);
            backtrack(i + 1, n, k);
            path.remove(path.size() - 1);
        }
    }
}