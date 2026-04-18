class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Deque<Integer> dq = new LinkedList<>();
        int time = 0;
        for(String s: logs){
            int index1 = s.indexOf(":");
            int index2 = s.lastIndexOf(":");
            int funNumber = Integer.parseInt(s.substring(0, index1));
            boolean state = s.charAt(index1+1) == 's'; // false -> end, true -> start
            int funTime = Integer.parseInt(s.substring(index2+1));

            if(state){
                if(!dq.isEmpty()){
                    int prev = dq.peekFirst();
                    ans[prev] += (funTime-time);
                }
                dq.push(funNumber);
                time = funTime;
            }
            else{
                ans[dq.pop()] += funTime - time + 1;
                time = funTime+1;
            }
        }
        return ans;
    }
}