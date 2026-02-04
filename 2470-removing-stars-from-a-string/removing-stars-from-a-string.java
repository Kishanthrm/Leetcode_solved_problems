class Solution {
    public String removeStars(String s) {
        int i=0;
        StringBuilder str1 = new StringBuilder();
        while(i != s.length()){
            if(s.charAt(i) != '*'){
                str1.append(s.charAt(i));
            }
            else if(s.charAt(i) == '*'){
                if(str1.length() > 0)str1.deleteCharAt(str1.length() - 1);
            }
            i++;
        }
        return str1.toString();
    }
}