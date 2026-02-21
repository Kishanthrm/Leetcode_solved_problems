class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                ch = Character.toLowerCase(ch);
                str.append(ch);
            }
        }
        if(str.length()%2 == 0){
            int i = (str.length()/2)-1;
            int j = i+1;
            while(i >= 0 && j < str.length()){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                i--;
                j++;
            }
            return true;
        }
        else{
            int i = (str.length()/2);
            int j = i;
            while(i >= 0 && j < str.length()){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                i--;
                j++;
            }
            return true;
        }
    }
}