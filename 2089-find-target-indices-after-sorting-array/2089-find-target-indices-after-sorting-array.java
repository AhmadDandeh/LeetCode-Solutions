class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int count = 0, countMin = 0;
        for(int num: nums){
            if(num == target) count++;
            else if(num<target) countMin++;
        }
        while(count-- >0) ans.add(countMin++);
        return ans;
    }
}