class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> ans = new LinkedList<>();
        if(n == 0) return ans;
        
        int start = nums[0];
        StringBuilder sb = new StringBuilder();
        for(int i =1; i<n; i++){
            if(nums[i] != nums[i-1]+1){
                if(nums[i-1] == start) sb.append(start);
                else sb.append(start).append("->").append(nums[i-1]);
                ans.add(sb.toString());
                sb.setLength(0);
                start = nums[i];
            }
        }
        if(nums[n-1] == start) sb.append(start);
        else sb.append(start).append("->").append(nums[n-1]);
        ans.add(sb.toString());

        return ans;
    }
}