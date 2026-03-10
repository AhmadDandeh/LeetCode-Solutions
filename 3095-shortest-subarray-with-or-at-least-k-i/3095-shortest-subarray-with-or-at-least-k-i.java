class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if(k == 0){
            return 1;
        }

        int best = Integer.MAX_VALUE;
        
        for(int left = 0; left< nums.length; left++){
            int or = 0;
            for(int right = left; right < nums.length; right++){
                or |= nums[right];
                if(or >= k){
                    int len = right-left+1;
                    if(len == 1){
                        return 1;
                    }
                    best = Math.min(best, len);
                    break;
                }
                if (or == Integer.MAX_VALUE){
                    break;
                }
            }
        }

        return best == Integer.MAX_VALUE ? -1 : best;
    }
}