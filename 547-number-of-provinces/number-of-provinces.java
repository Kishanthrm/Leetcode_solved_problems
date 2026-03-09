class Solution {
    public int findCircleNum(int[][] connect) {
        int size = connect.length;
        int[] visited = new int[size];
        int cnt = 0;
            for(int i = 0;i<size;i++){
                if(visited[i] == 0){
                    cnt++;
                    dfs(connect,i,visited);
                }
            }
            return cnt;
    }

    public void dfs(int[][] arr, int i, int[] visited) {
        int m = arr.length, n = arr[0].length;
        Stack<Integer> st = new Stack<>();
        st.add(i);
        visited[i] = 1;
        while (!st.isEmpty()) {
            int num = st.pop();
            for (int j = 0; j < n; j++) {
                if (num != j && visited[j] == 0 && arr[num][j] == 1) {
                    st.push(j);
                    visited[j] = 1;
                }
            }
        }
    }
}