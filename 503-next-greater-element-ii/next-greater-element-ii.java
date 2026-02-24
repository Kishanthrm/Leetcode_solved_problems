class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];
        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        for (int i = 2*nums.length - 1; i >= 0; i--) {
            int idx = i%nums.length;
            if (st.isEmpty()) {
                res[idx] = -1;
            } else {
                while (!st.isEmpty() && st.peek() <= nums[idx]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    res[idx] = -1;
                } else {
                    res[idx] = st.peek();
                }
            }
            st.push(nums[idx]);
        }
        return res;
    }
}