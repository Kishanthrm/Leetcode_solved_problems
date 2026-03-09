class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] visited = new int[image.length][image[0].length];
        int same = image[sr][sc];
        bfs(visited,sr,sc,image, color,same);
        return image;
    }
    public void bfs(int[][] visited, int k, int l, int[][] arr, int color,int same){
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{k,l});
        visited[k][l] = 1;
        arr[k][l] = color;
        int[] ro = new int[]{-1,0,1,0};
        int[] co = new int[]{0,1,0,-1};
        while(!que.isEmpty()){
            int[] node = que.poll();
            int r = node[0];
            int c = node[1];
            for(int i=0;i<4;i++){
                int row = r+ro[i];
                int col = c+co[i];
                if((row >= 0 && col >= 0) && (row < arr.length && col < arr[0].length) && (visited[row][col] == 0) && (arr[row][col] == same)){
                    que.offer(new int[]{row,col});
                    visited[row][col] = 1;
                    arr[row][col] = color;
                }
            }
        }
    }
}