class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(3);
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
                if(pq.size()<3){
                    pq.add(num);
                    max = Math.max(max, num);
                }
                else if(pq.peek() < num){
                    pq.poll();
                    pq.add(num);
                    max = Math.max(max, num);
                }
            }
        }
        return pq.size() == 3? pq.peek():max;
    }
}