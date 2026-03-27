class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0) return tasks.length;
        if(tasks.length == 1) return 1;
        
        int ans = 0;
        int[] chars = new int[26];
        for(char c: tasks) chars[c-'A']++;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int c: chars) if(c>0) pq.add(c);

        int[] poped = new int[n+1];
        outer: while(!pq.isEmpty()){
            for(int i = 0; i <= n; i++){
                if(!pq.isEmpty()){
                    ans++;
                    poped[i] = pq.remove();
                }
                else{
                    if(poped[0] == 1) break outer;
                    else ans++;
                }
            }
            for(int i = 0; i<= n; i++){
                if(poped[i] == 0) break;
                if(poped[i] == 1){
                    Arrays.fill(poped,0);
                    break;
                }
                pq.add(poped[i]-1);
                poped[i] = 0;
            }
        }

        return ans;
    }
}