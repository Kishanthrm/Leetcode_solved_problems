class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;
        int m = grid.length, n = grid[0].length, l = 0;
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{0,0,1});
        int[][] visited = new int[m][n];
        visited[0][0] = 1;
        int[] ro = {-1,-1,-1,0,1,1,1,0};
        int[] co = {-1,0,1,1,1,0,-1,-1};
        while(!que.isEmpty()){
            int[] node = que.poll();
            int r = node[0];
            int c = node[1];
            l = node[2];
            if(r == m-1 && c == n-1) return l;
            for(int d = 0;d<8;d++){
                int row = r + ro[d];
                int col = c + co[d];
                if((row >= 0 && col >= 0) && (row < m && col < n) && (visited[row][col] == 0) && grid[row][col] == 0){
                    que.offer(new int[]{row,col,l+1});
                    visited[row][col] = 1;
                } 
            }
        }
        return -1;
    }
}