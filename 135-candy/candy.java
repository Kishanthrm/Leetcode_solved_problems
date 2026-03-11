class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];
        Arrays.fill(candy,1);

        boolean changed = true;

        while(changed){
            changed = false;

            for(int i=0;i<n;i++){
                if(i>0 && ratings[i] > ratings[i-1] && candy[i] <= candy[i-1]){
                    candy[i] = candy[i-1] + 1;
                    changed = true;
                }

                if(i<n-1 && ratings[i] > ratings[i+1] && candy[i] <= candy[i+1]){
                    candy[i] = candy[i+1] + 1;
                    changed = true;
                }
            }
        }

        int sum = 0;
        for(int c : candy) sum += c;
        return sum;
    }
}