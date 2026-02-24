class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] left = new int[prices.length];
        int[] res = new int[prices.length];
        for(int i = prices.length-1;i>=0;i--){
            while(!st.isEmpty() && prices[i] < st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = 0;
            }
            else{
                left[i] = st.peek();
            }
            st.push(prices[i]);
        }
        for(int i=0;i<left.length;i++){
            res[i] = prices[i]-left[i];
        }
        return res;
    }
}