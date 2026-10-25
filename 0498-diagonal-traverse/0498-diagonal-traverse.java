class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0, col = 0, m = mat.length, n = mat[0].length;
        boolean up = true;
        int size = m * n;
        int[] ans = new int[size];
        int index = 0;
        while(index < size){
            if(up){
                while(row >= 0 && col <n){
                    ans[index++] = mat[row--][col++];
                }
                row++;
                if(col == n){
                    row++;
                    col--;
                }
                up = !up;
            }
            else{
                while(col >= 0 && row <m){
                    ans[index++] = mat[row++][col--];
                }
                col++;
                if(row == m){
                    row--;
                    col++;
                }
                up = !up;
            }
        }
        return ans;
    }
}