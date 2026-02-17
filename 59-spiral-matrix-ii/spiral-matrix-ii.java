class Solution {
    public int[][] generateMatrix(int p) {
        int[][] matrix = new int[p][p];
        int n = matrix.length, m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=p*p;i++){
            list.add(i);
        }
        int top = 0,bottom = n-1,left = 0, right = m-1,idx = 0;
        while(left <= right && top <= bottom){
            for(int i = left;i<=right;i++){
                matrix[top][i] = list.get(idx++);
            }
            top++;
            for(int i = top;i<=bottom;i++){
                matrix[i][right] = list.get(idx++);
            }
            right--;
            if(top <= bottom){
                for(int i = right;i>=left;i--){
                    matrix[bottom][i] = list.get(idx++);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom;i>=top;i--){
                    matrix[i][left] = list.get(idx++);
                }
                left++;
            }
        }
        return matrix;
    }
}