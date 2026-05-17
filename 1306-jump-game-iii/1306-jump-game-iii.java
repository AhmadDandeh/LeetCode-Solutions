class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(start);
        visited[start] = true;
        while(!dq.isEmpty()){
            int pos = dq.removeFirst();
            if(arr[pos] == 0) return true;
            int prePos = pos - arr[pos];
            if(prePos >= 0 && !visited[prePos]){
                visited[prePos] = true;
                dq.addLast(prePos);
            }
            int latPos = pos + arr[pos];
            if(latPos <n && !visited[latPos]){
                visited[latPos] = true;
                dq.addLast(latPos);
            }
        }
        return false;
    }
}