class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                arr[i] = ch;
            }
            else{
                if(ch == '('){
                    st.push(i);
                }
                else{
                    if(!st.isEmpty()){
                        int num = st.pop();
                        arr[num] = '(';
                        arr[i] = ')';
                    }
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(char ch : arr){
            if(Character.isLetter(ch) || ch == '(' || ch == ')'){
                str.append(ch);
            }
        }
        return str.toString();
    }
}