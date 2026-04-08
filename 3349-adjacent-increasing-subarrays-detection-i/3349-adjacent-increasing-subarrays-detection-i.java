class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if(n<2*k) return false;
        int prev = nums.get(0), next;
        int[] prefix = new int[n];
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            next = nums.get(i);
            if(next>prev) prefix[i] = prefix[i-1]+1;
            else prefix[i] = 1;
            prev = next;
        }
        
        for(int i=n-1; i>=k; i--){
            if(prefix[i]>=k && prefix[i-k]>=k) return true;
        }
        return false;
    }
}