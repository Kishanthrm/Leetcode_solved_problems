class Solution {
    public String decodeString(String s) {
        Stack<Integer> numSt = new Stack<>();
        Stack<StringBuilder> strSt = new Stack<>();
        int num=0;

        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }
            else if(ch == '['){
                numSt.push(num);
                num = 0;
                strSt.push(str);
                str = new StringBuilder();
            }
            else if(ch == ']'){
                String st = str.toString();
                str = new StringBuilder(st.repeat(numSt.pop()));
                str = strSt.pop().append(str);
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}