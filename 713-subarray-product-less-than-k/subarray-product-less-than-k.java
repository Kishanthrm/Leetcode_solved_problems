class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1)return 0;
        int i=0,j=0;
        int pro = 1,cnt = 0;
        while(j < nums.length){
            pro *= nums[j];
            while(i < nums.length && pro >= k){
                pro /= nums[i];
                i++;
            }
            cnt += (j-i+1);
            j++;
        }
        return cnt > 0? cnt : 0;
    }
}