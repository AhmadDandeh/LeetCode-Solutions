class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] rowPrefix = new int[m][n + 1];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                rowPrefix[r][c + 1] = rowPrefix[r][c] + grid[r][c];
            }
        }

        int[][] colPrefix = new int[m + 1][n];
        for (int c = 0; c < n; c++) {
            for (int r = 0; r < m; r++) {
                colPrefix[r + 1][c] = colPrefix[r][c] + grid[r][c];
            }
        }

        int maxLen = Math.min(m, n);
        for (int len = maxLen; len >= 2; len--) {
            for (int i = 0; i + len <= m; i++) {
                outer:
                for (int j = 0; j + len <= n; j++) {

                    int d1 = 0, d2 = 0;
                    for (int k = 0; k < len; k++) {
                        d1 += grid[i + k][j + k];
                        d2 += grid[i + k][j + (len - 1 - k)];
                    }
                    if (d1 != d2) continue;

                    // rows
                    for (int r = i; r < i + len; r++) {
                        int rowSum = rowPrefix[r][j + len] - rowPrefix[r][j];
                        if (rowSum != d1) continue outer;
                    }

                    // cols
                    for (int c = j; c < j + len; c++) {
                        int colSum = colPrefix[i + len][c] - colPrefix[i][c];
                        if (colSum != d1) continue outer;
                    }

                    return len;
                }
            }
        }
        return 1;
    }
}