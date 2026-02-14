class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0] <= target && matrix[i][m-1] >= target){
                return binarySearch(matrix[i],target);
            }
        }
        return false;
    }

    public boolean binarySearch(int arr[], int target){
        int low = 0, high = arr.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target)return true;

            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}