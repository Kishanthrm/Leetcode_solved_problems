class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        int[][] dir = new int[][]{{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2}};
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int []{0,0});
        int rows = grid.length;
        int cols = grid[0].length;
        while(!que.isEmpty()){
            int[] deq = que.poll();
            int deq_row = deq[0];
            int deq_col = deq[1];
            if(grid[deq_row][deq_col]==rows*rows-1)return true;
            for(int i = 0;i<dir.length;i++){
                int cal_row = deq_row+dir[i][0];
                int cal_col = deq_col+dir[i][1];
                if(cal_row >= 0 && cal_row < rows && cal_col >= 0 && cal_col < cols){
                    
                    if(grid[deq_row][deq_col]+1 == grid[cal_row][cal_col]){
                    que.offer(new int []{cal_row,cal_col});
                    }
                }
            }
        }
        return false;
    }
}