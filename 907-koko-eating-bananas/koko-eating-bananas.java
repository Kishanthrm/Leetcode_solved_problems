class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1,high = piles[n-1];
        for(int p : piles)
            high = Math.max(high, p);
        int ans = high;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(canFinish(mid,piles,h)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public boolean canFinish(int k,int[] arr,int h){
        int ans = 0;
        for(int i : arr){
            ans += Math.ceil((double)i/(double)k);
        }
        return ans <= h;
    }
}