class Solution {
    public boolean isPossible(int[] target) {
        if (target.length == 1) return target[0] == 1;
        
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for(int num:target){
            if(num != 1) pq.add((long) num);
            sum += num;
        }
        while(!pq.isEmpty()){
            long biggest = pq.poll();
            long restSum = sum - biggest;
            if(restSum == 1) return true;
            if(restSum <1 || biggest <= restSum) return false;
            long newNumber = biggest % restSum;
            if(newNumber < 1) return false;
            if(newNumber != 1) pq.add(newNumber);
            sum = restSum + newNumber;
        }
        return true;
    }
}