class Solution {
    public int[] decrypt(int[] code, int k) {
        int sum = 0, size = code.length, temp = k, j = 0;
        int[] res = new int[size];
        if (k >= 0) {
            for (int i = 0; i < size; i++) {
                j = i + 1;
                while (temp != 0) {
                    if (j < size) {
                        sum += code[j];
                        j++;
                        temp--;
                    } else {
                        j = 0;
                    }
                }
                res[i] = sum;
                sum = 0;
                temp = k;
            }
        }
        else{
            for(int i = 0;i < size;i++){
                j = i-1;
                while(temp != 0){
                    if(j >= 0){
                        sum += code[j];
                        j--;
                        temp++;
                    }
                    else{
                        j = size-1;
                    }
                }
                res[i] = sum;
                sum = 0;
                temp = k;
            }
        }
        return res;
    }
}