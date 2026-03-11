class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder(strs[0]);
        for(int i=0;i<strs.length;i++){
            while(!strs[i].startsWith(str.toString())){
                str.deleteCharAt(str.length()-1);
                if(str.length() == 0){
                    return "";
                }
            }
        }
        return str.toString();
    }
}