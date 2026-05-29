class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num = 1, max = n*n, dir = 0, upL = 1, downL = n-1, leftL = 0, rightL = n-1;
        int i = 0, j = 0;
        while(num<=max){
            ans[i][j] = num;
            if(dir == 0){
                if(j == rightL){
                    rightL--;
                    dir = 1;
                    i++;
                }
                else j++;
            }
            else if(dir == 1){
                if(i == downL){
                    downL--;
                    dir = 2;
                    j--;
                }
                else i++;
            }
            else if(dir == 2){
                if(j == leftL){
                    leftL++;
                    dir = 3;
                    i--;
                }
                else j--;
            }
            else{
                if(i == upL){
                    upL++;
                    dir = 0;
                    j++;
                }
                else i--;
            }
            num++;
        }
        return ans;
    }
}