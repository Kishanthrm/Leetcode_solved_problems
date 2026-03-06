import java.util.*;

class Solution {
    public int hIndex(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0] >= 1 ? 1 : 0;
        int max = 0;
        for(int i = 0; i <= n; i++){   
            if(countt(i, arr)){
                max = Math.max(i, max);
            }
        }

        return max;
    }

    public boolean countt(int num, int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= num){
                count++;
            }
        }

        return count >= num;
    }
}