class Solution {
    public int strStr(String h, String n) {
        int hsize = h.length(), nsize = n.length();
        boolean flag = true;
        if(hsize < nsize)return -1;
        int i=0, j=0;
        while(i < hsize){
            int temp = i;
            j = 0;
            flag =true;
            while(temp < hsize && flag){
                if(h.charAt(temp) != n.charAt(j)){
                    flag = false;
                }  
                if(j == nsize-1 && flag)return i;
                temp++;
                j++;
            }
            i++;
        }
        return -1;
    }
}