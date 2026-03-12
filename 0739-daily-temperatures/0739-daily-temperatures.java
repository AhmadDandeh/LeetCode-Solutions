class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> dq = new ArrayDeque<>(n);
        for(int i = n-1; i>=0; i--){
            while(!dq.isEmpty() && temperatures[dq.peekLast()] <= temperatures[i]) dq.removeLast();
            if(dq.isEmpty()) ans[i] = 0;
            else ans[i] = dq.peekLast() - i;
            dq.addLast(i);
        }
        return ans;
    }
}