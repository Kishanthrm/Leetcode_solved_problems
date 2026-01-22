class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> cur = new ArrayList<>();
        int start = 1;
        backTracking(start,n,k,cur);
        return result;
    }

    public void backTracking(int start, int n,int k,List<Integer> cur){
        if(cur.size() == k){
            result.add(new ArrayList<>(cur));
            return;
        }

        for(int i = start;i<=n;i++){
            cur.add(i);
            backTracking(i+1,n,k,cur);
            cur.remove(cur.size()-1);
        }
    }
}