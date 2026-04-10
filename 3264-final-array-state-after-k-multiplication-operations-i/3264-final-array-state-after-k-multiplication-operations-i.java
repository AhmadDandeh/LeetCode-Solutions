class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)-> a[0] == b[0]? Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0])
        );

        for(int i=0; i<nums.length; i++){
            pq.offer(new int[]{nums[i],i});
        }
        for(int i=0; i<k;i++){
            int[] cur = pq.poll();
            int index = cur[1];
            nums[index] = cur[0] * multiplier;
            pq.offer(new int[]{nums[index],index});
        }
        return nums;
    }
}