class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((b,a) -> a[1]-b[1]);
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty()){
            int[] num = pq.poll();
            char ch = (char)num[0];
            int cnt = num[1];
            while(cnt != 0){
                str.append(ch);
                cnt--;
            }
        }
        return str.toString();
    }
}