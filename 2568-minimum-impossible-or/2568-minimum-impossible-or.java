class Solution {
    public int minImpossibleOR(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums) set.add(n);
        int ans = 1;
        while(set.contains(ans)){
            ans <<= 1;
        }
        return ans;
    }
}