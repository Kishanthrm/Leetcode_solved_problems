class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows*cols];
        int idx = 0;
        for(int i=0;i<rows+cols-1;i++){
            
            int r = (i < cols) ? 0:i-cols+1;
            int c = (i < cols) ? i:cols-1;

            List<Integer> list = new ArrayList<>();

            while(r < rows && c >= 0){
                list.add(mat[r][c]);
                r++;
                c--;
            }

            if(i%2 == 0){
                Collections.reverse(list);
            }
            for(int j=0;j<list.size();j++){
                res[idx++] = list.get(j);
            }
        }
        return res;
    }
}