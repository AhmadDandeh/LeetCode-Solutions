class Solution {
    public int eatenApples(int[] apples, int[] days) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        int ans = 0, i = 0, n = days.length;
        while(!pq.isEmpty() || i<n){
            if (i < n && apples[i] > 0) pq.add(new int[]{i + days[i], apples[i]});
            
            while (!pq.isEmpty() && pq.peek()[0] <= i) pq.poll();
            
            if (!pq.isEmpty()) {
                int[] curr = pq.poll();
                curr[1]--;
                ans++;
                
                if (curr[1] > 0 && curr[0] > i + 1) pq.add(curr);
            }
            i++;
        }
        return ans;
    }
}