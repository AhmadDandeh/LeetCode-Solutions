class Solution {
    public int specialTriplets(int[] nums) {
        long ans = 0;
        HashMap<Integer, Integer> prefix = new HashMap<>();
        HashMap<Integer, Integer> suffix = new HashMap<>();
        for(int i = 1; i<nums.length; i++) suffix.put(nums[i], suffix.getOrDefault(nums[i], 0)+1);
        prefix.put(nums[0],1);
        for(int i=1; i<nums.length-1; i++){
            suffix.put(nums[i], suffix.getOrDefault(nums[i], 0)-1);
            int n = nums[i]*2;
            ans = (ans + (long) prefix.getOrDefault(n,0)*suffix.getOrDefault(n,0)) % 1_000_000_007L;
            prefix.put(nums[i], prefix.getOrDefault(nums[i], 0)+1);
        }
        return (int) ans;
    }
}