class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> close = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open.push(i);
            }
            else{
                if(open.isEmpty()){
                    close.push(i);
                }
                else{
                    open.pop();
                }
            }
        }
        return Math.abs(open.size() + close.size());
    }
}