class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
    int n = box[0].length;

    // Step 1: Simulate gravity in each row
    for (int i = 0; i < m; i++) {
        int empty = n - 1;
        for (int j = n - 1; j >= 0; j--) {
            if (box[i][j] == '*') {
                empty = j - 1;
            } else if (box[i][j] == '#') {
                if (j != empty) {
                    box[i][empty] = '#';
                    box[i][j] = '.';
                }
                empty--;
            }
        }
    }

    // Step 2: Rotate the box
    char[][] rotated = new char[n][m];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            rotated[j][m - 1 - i] = box[i][j];
        }
    }

    return rotated;
    }
}