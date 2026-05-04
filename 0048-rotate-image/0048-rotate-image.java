class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){   
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] arr: matrix){
            int l = 0, r = n-1;
            while(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }
}