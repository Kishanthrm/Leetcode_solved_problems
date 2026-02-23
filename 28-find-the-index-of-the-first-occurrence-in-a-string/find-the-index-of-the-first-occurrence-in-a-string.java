class Solution {
    public int strStr(String text, String pat) {
        if(text.length() == 1 && pat.length() == 1 && text.charAt(0) == pat.charAt(0))return 0;
        int n = text.length(), m = pat.length();
        int ans = -1;
        boolean flag = false;
        for(int i=0;i<n-m+1;i++){
            for(int j=0;j<m;j++){
                if(text.charAt(i+j) != pat.charAt(j)){
                    break;
                }
                if(j == m-1){
                    ans = i;
                    flag = true;
                }
            }
            if(flag){
                break;
            }
        }
        return ans;
    }
}