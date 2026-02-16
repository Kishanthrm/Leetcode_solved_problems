class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0,max = 0;
        for(int i : weights){
            sum += i;
            max = Math.max(max, i);
        }
        int low = max, high = sum, ans = sum;
        while(low <= high){
            int mid = low+(high-low)/2;

            if(canLift(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public boolean canLift(int[] arr, int k, int days){
        int weight = 0, day = 1;
        for(int i: arr){
            if(weight + i <= k){
                weight += i;
            }
            else{
                day++;
                weight = i;
            }
        }
        return day <= days;
    }
}