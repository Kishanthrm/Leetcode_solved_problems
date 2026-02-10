class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<gifts.length;i++){
            pq.offer(gifts[i]);
        }
        while(k > 0){
            int num = pq.poll();
            num = (int)Math.sqrt(num);
            pq.offer(num);
            k--;
        }
        long sum=0,size = pq.size();
        for(int i =0;i<size;i++){

            sum += pq.poll();
        }
        return sum;
    }
}