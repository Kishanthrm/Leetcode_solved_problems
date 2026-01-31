class Solution {
    public boolean canFinish(int n, int[][] mat) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int [] indeg = new int[n];
        for(int []edge: mat){
            int ai = edge[0];
            int bi = edge[1];
            adj.get(bi).add(ai);
            indeg[ai]++;
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indeg[i] == 0){
                que.offer(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(que.size()>0){
            int node = que.poll();
            ans.add(node);
            for(int a:adj.get(node)){
                indeg[a]--;
                if(indeg[a]==0){
                    que.offer(a);
                }
            }
        }
        return ans.size() == n;
    }
}