class Solution {
    public int[] find(String s){
        int lps[]=new int [s.length()];
        int len=0,i=1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else if(s.charAt(i)!=s.charAt(len)){
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int strStr(String haystack, String needle) {
        int lps[]=find(needle);
        int j=0,i=0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return i - j;
            } 
            else if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }
}