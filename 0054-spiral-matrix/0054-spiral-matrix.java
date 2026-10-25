class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int index = 0, size = m*n, r = 0, c = 0, dir = 0;
        int up = 0, down = m, left = -1, right = n;
        List<Integer> ans = new ArrayList<>(size);
        while(index < size){
            if(dir == 0){ // right
                while(c<right){
                    ans.add(matrix[r][c++]);
                    index++;
                }
                dir++;
                c--;
                r++;
                right--;
            }
            else if(dir == 1){ // down
                while(r < down){
                    ans.add(matrix[r++][c]);
                    index++;
                }
                dir++;
                c--;
                r--;
                down--;
            }
            else if(dir == 2){ // left
                while(c > left){
                    ans.add(matrix[r][c--]);
                    index++;
                }
                dir++;
                c++;
                r--;
                left++;
            }
            else{ // up
                while(r > up){
                    ans.add(matrix[r--][c]);
                    index++;
                }
                dir = 0;
                c++;
                r++;
                up++;
            }
        }
        return ans;
    }
}