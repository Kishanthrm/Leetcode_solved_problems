class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=0,j=0;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        while(i != s.length()){
            if(s.charAt(i) != '#'){
                str1.append(s.charAt(i));
            }
            else if(s.charAt(i) == '#'){
                if(str1.length() > 0)str1.deleteCharAt(str1.length() - 1);
            }
            i++;
        }
        while(j != t.length()){
            if(t.charAt(j) != '#'){
                str2.append(t.charAt(j));
            }
            else if(t.charAt(j) == '#'){
                if(str2.length() > 0)str2.deleteCharAt(str2.length() - 1);
            }
            j++;
        }
        return str1.toString().equals(str2.toString());
    }
}