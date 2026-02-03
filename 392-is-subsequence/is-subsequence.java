class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,i=0,cnt=0;
        while(i < t.length() && j<s.length()){
            if(s.charAt(j) == t.charAt(i)){
                j++;
                cnt++;
            }
            if(cnt != s.length() && i == t.length()-1)return false;
            i++;
        }
        return cnt == s.length();
    }
}