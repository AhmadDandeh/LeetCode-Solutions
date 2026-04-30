class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] valid = new boolean[nums.length+1];
        for(int num:nums) valid[num] = true;
        List<Integer> ans = new ArrayList<>();
        for(int i =1; i< valid.length; i++) if(!valid[i]) ans.add(i);
        return ans;
    }
    /*
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums) set.add(n);
        List<Integer> ans = new LinkedList<>();
        for(int i =1; i<=nums.length; i++) if(!set.contains(i)) ans.add(i);
        return ans;
    }
    */
}