class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length, can1 = Integer.MIN_VALUE, can2 = Integer.MIN_VALUE, count1 = 0, count2 = 0, lim = n/3;
        List<Integer> ans = new ArrayList<>(2);
        for(int num: nums){
            if (num == can1) {
                count1++;
            } else if (num == can2) {
                count2++;
            } else if (count1 == 0) {
                can1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                can2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num: nums){
            if(num == can1) count1++;
            else if(num == can2) count2++;
        }
        if(count1> lim) ans.add(can1);
        if(count2> lim) ans.add(can2);
        return ans;
    }
}