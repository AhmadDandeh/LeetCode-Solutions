class Solution {
    public int[][] generateSchedule(int n) {
        if(n<5) return new int[][]{};
        int matches = n * (n-1);
        int[][] ans = new int[matches][2];
        boolean[][] ava = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i != j) ava[i][j] = true;
            }
        }
        int prevHome = -1, prevAway = -1;
        int k = 0;
        int home =0, away = 0;
        while(k<matches){
            while(!ava[home][away] || away == prevHome || away == prevAway){
                while(home == prevHome || home == prevAway){
                    home = ++home % n;
                    away = home;
                }
                away = ++away % n;
                
                if(away == home){
                    home = ++home % n;
                }
            }
            ans[k][0] = home;
            prevHome = home;
            ans[k][1] = away;
            prevAway = away;
            ava[home][away] = false;
            k++;
        }
        return ans;
    }
}