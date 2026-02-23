class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> open = new Stack<>();
        Stack<Character> close = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open.push(ch);
            }
            else{
                if(open.isEmpty()){
                    close.push(ch);
                }
                else{
                    open.pop();
                }
            }
        }
        return (open.size() + close.size());
    }
}