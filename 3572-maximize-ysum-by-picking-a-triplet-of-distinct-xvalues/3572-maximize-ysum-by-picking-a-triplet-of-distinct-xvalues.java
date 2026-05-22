class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int[] maxValues = new int[1000001];
        int uniqueCount = 0;
        for (int i = 0; i < x.length; i++) {
            int xVal = x[i];
            int yVal = y[i];
            if (maxValues[xVal] == 0) {
                uniqueCount++;
            }
            if (yVal > maxValues[xVal]) {
                maxValues[xVal] = yVal;
            }
        }
        if (uniqueCount < 3) return -1;
        int firstMax = 0, secondMax = 0, thirdMax = 0;
        for (int val : maxValues) {
            if (val > 0) {
                if (val > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = val;
                } else if (val > secondMax) {
                    thirdMax = secondMax;
                    secondMax = val;
                } else if (val > thirdMax) {
                    thirdMax = val;
                }
            }
        }
        return firstMax + secondMax + thirdMax;
    }
    /*
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<x.length; i++){
            map.put(x[i], Math.max(map.getOrDefault(x[i],0), y[i]));
        }
        if(map.size()<3) return -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(3);
        for(Integer yy: map.values()){
            if(pq.size() == 3){
                if(pq.peek()<yy){
                    pq.poll();
                    pq.add(yy);
                }
            }
            else{
                pq.add(yy);
            }
        }
        int ans = 0;
        while(!pq.isEmpty()) ans += pq.poll();
        return ans;
    }
    */
    /*
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int n = x.length;
        int[][] xy = new int[n][2];
        for(int i = 0; i<n; i++){
            xy[i][0] = x[i];
            xy[i][1] = y[i];
        }
        Arrays.sort(xy, Comparator.comparingInt(a -> -a[1]));
        int first = -1, second = -1, third = -1;
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(first == -1){first = xy[i][0];ans += xy[i][1];}
            else if(first != xy[i][0] && second == -1){ second = xy[i][0]; ans += xy[i][1];}
            else if(first != xy[i][0] && second != xy[i][0]){third = xy[i][0]; ans += xy[i][1]; break;}
        }
        return third == -1? -1:ans;
    }
    */
}