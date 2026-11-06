class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        int mA = 0, nA = 0;
        for(int[] arr: indices){
            mA += rows[arr[0]] ? -1 : 1;
            nA += cols[arr[1]] ? -1 : 1;

            rows[arr[0]] = !rows[arr[0]];
            cols[arr[1]] = !cols[arr[1]];
        }
        return mA * (n - nA) + nA * (m - mA);
    }
}