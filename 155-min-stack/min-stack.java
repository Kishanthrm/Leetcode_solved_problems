class MinStack {
    Stack<Integer> st;
    PriorityQueue<Integer> pq;

    public MinStack() {
        st = new Stack<>();
        pq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        st.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        int rem = st.pop();
        pq.remove(rem);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min =  pq.poll();
        pq.offer(min);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */