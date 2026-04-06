class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(b[0], a[0]);
        });
        int size = 2;
        int firstMax = intervals[0][1];
        int secondMax = firstMax-1;
        
        for(int i = 1; i < intervals.length; i++){
            if(firstMax < intervals[i][0]){
                firstMax = intervals[i][1];
                secondMax = firstMax-1;
                size += 2;
            }
            else if(secondMax < intervals[i][0]){
                secondMax = firstMax;
                firstMax = intervals[i][1];
                size ++;
            }
        }
        return size;
    }
}