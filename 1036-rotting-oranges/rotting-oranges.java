class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> que = new LinkedList<>();
        int[][] vis = new int[grid.length][grid[0].length];
        int[] ro = { -1, 0, 1, 0 };
        int[] co = { 0, 1, 0, -1 };
        int l = 0, fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    que.offer(new Pair(i, j, l));
                } else if (grid[i][j] == 1) {
                    ++fresh;
                }
            }
        }
        while (que.size() > 0) {

            int row, col;
            Pair node = que.poll();
            l = node.t;
            int r = node.i;
            int c = node.j;
            for (int d = 0; d < 4; d++) {
                row = r + ro[d];
                col = c + co[d];
                if ((row >= 0 && row <= grid.length - 1) && (col >= 0 && col <= grid[0].length - 1)
                        && vis[row][col] == 0 && grid[row][col] == 1) {
                    vis[row][col] = 1;
                    grid[row][col] = 2;
                    que.offer(new Pair(row, col, l + 1));
                    --fresh;
                }
            }
        }
        return fresh == 0 ? l : -1;
    }
}

class Pair {
    int i;
    int j;
    int t;

    Pair(int i, int j, int t) {
        this.i = i;
        this.j = j;
        this.t = t;
    }
}