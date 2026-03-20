class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        long days = 0;
        int n = tasks.length;
        HashMap<Integer, Long> map = new HashMap<>(); // number, last time
        for(int t: tasks){
            if(map.containsKey(t)){
                long allowed = map.get(t) + space +1;
                if(days < allowed) days = allowed;
            }
            map.put(t, days);
            days++;
        }
        return days;
    }
}