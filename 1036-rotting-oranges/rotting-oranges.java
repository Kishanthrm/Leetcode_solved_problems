class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0, m = grid.length, n = grid[0].length,l = 0;
        int[][] visited = new int[m][n];
        Queue<Pair> que = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    que.offer(new Pair(i,j,l));
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int[] ro = {-1,0,1,0};
        int[] co = {0,1,0,-1};
        while(!que.isEmpty()){
            Pair node = que.poll();
            int r = node.r;
            int c = node.c;
            l = node.t;
            for(int d=0;d<4;d++){
                int row = r + ro[d];
                int col = c + co[d];
                if(((row >= 0 && col >= 0) && (row < m && col < n)) && (visited[row][col] == 0) && (grid[row][col] == 1)){
                    grid[row][col] = 2;
                    visited[row][col] = 1;
                    que.offer(new Pair(row,col,l+1));
                    --fresh;
                }
            }
        }
        return fresh == 0? l : -1;
    }
}

class Pair{
    int r;
    int c;
    int t;

    Pair(int r, int c, int t){
        this.r = r;
        this.c = c;
        this.t = t;
    }
}