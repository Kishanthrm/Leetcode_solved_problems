class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<stones.length;i++){
            pq.offer(stones[i]);
        }
        while(pq.size() > 1){
            int num1 = pq.poll();
            int num2 = pq.poll();
            if(num1 != num2){
                pq.offer(num1-num2);
            }
        }
        return pq.size() == 0? 0:pq.poll();
    }
}