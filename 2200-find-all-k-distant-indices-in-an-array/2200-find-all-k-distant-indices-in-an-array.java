class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int left = -1;
        for(int right =0; right<n; right++){
            if(nums[right] == key){
                left = Math.max(0, Math.max(right-k, left));
                while(left <= right+k && left<n){
                    ans.add(left++);
                }
            }
        }
        return ans;
    }
}