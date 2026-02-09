class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((b,a) -> a-b);
        for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
        }
        String[] str = new String[score.length];
        int cnt=1;
        while(!pq.isEmpty()){
            int num = pq.poll();
            for(int i=0;i<score.length;i++){
                if(score[i] == num){
                    if(cnt == 1){
                        str[i] = "Gold Medal";
                        cnt++;
                    }
                    else if(cnt == 2){
                        str[i] = "Silver Medal";
                        cnt++;
                    }
                    else if(cnt == 3){
                        str[i] = "Bronze Medal";
                        cnt++;
                    }
                    else{
                        str[i] = cnt+"";
                        cnt++;
                    }
                }
            }
        }
        return str;
    }
}