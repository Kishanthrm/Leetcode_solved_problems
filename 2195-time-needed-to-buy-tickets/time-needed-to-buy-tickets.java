class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            que.offer(i);
        }
        int time = 0;
        while(true){
            int person = que.poll();
            tickets[person]--;
            time++;
            if(tickets[person] == 0){
                if(person == k)return time;
            }
            else{
                que.offer(person);
            }
        }
    }
}