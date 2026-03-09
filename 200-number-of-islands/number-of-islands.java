class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] visited = new int[m][n];
        int cnt = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    cnt++;
                    dfs(visited, i, j, grid);
                }
            }
        }
        return cnt;
    }
    public void dfs(int[][] visited,int k,int l, char[][] arr){
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{k,l});
        while(!st.isEmpty()){
            int[] node = st.pop();
            int r = node[0];
            int c = node[1];

            int[] ro = {-1,0,1,0};
            int[] co = {0,1,0,-1};

            for(int i=0;i<4;i++){
                int row = r+ro[i];
                int col = c+co[i];
                if((row >= 0 && col >= 0) && (row < arr.length && col < arr[0].length) && (visited[row][col] == 0) && (arr[row][col] == '1')){
                    st.push(new int[]{row,col});
                    visited[row][col] = 1;
                }
            }
        }
    }
}