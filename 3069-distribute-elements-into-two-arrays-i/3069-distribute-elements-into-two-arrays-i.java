class Solution {
    public int[] resultArray(int[] nums) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int j = 0;
        dq.addLast(nums[1]);
        for(int i=2; i<nums.length; i++){
            if(nums[j]>dq.peekLast()) nums[++j] = nums[i];
            else dq.addLast(nums[i]);
        }
        while(!dq.isEmpty()){
            nums[++j] = dq.removeFirst();
        }
        return nums;
    }
}