class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] next = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                int lives = numberOfLives(board, i, j);

                if(board[i][j] == 1) {
                    if(lives < 2 || lives > 3)
                        next[i][j] = 0;
                    else
                        next[i][j] = 1;
                } else {
                    if(lives == 3)
                        next[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                board[i][j] = next[i][j];
    }


    public int numberOfLives(int[][] mat, int i, int j) {
        int[] row = { -1, -1, -1, 0, 1, 1, 1, 0 };
        int[] col = { -1, 0, 1, 1, 1, 0, -1, -1 };

        int cnt = 0;
        for (int k = 0; k < row.length; k++) {
            int m = i + row[k];
            int n = j + col[k];
            if ((m < mat.length && n < mat[0].length) && (m >= 0 && n >= 0)) {
                if (mat[m][n] == 1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}