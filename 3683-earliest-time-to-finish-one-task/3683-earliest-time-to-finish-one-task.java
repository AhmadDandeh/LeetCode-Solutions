class Solution {
    public int earliestTime(int[][] tasks) {
        int min = tasks[0][0] + tasks[0][1];
        for(int i =1; i< tasks.length; i++){
            min = Math.min(min, tasks[i][0]+tasks[i][1]);
        }
        return min;
    }
}