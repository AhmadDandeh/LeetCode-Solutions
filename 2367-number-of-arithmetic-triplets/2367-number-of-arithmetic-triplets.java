class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        for(int j = 1; j< nums.length-1; j++){
            if(set.contains(nums[j]+diff) && set.contains(nums[j]-diff)) ans++;
        }

        return ans;
    }
}