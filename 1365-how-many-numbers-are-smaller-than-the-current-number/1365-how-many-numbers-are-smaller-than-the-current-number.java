class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for(int n: nums) arr[n]++;
        int pre = 0;
        for(int i=0; i<101; i++){
            int temp = arr[i];
            arr[i] = pre;
            pre += temp;
        }
        for(int i =0; i< nums.length; i++) nums[i] = arr[nums[i]];
        return nums;
    }
}