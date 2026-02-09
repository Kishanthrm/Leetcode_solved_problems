class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] res = new String[n];

        // max heap storing indices
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> score[b] - score[a]);

        for (int i = 0; i < n; i++) {
            pq.offer(i);
        }

        int rank = 1;

        while (!pq.isEmpty()) {
            int idx = pq.poll();

            if (rank == 1) res[idx] = "Gold Medal";
            else if (rank == 2) res[idx] = "Silver Medal";
            else if (rank == 3) res[idx] = "Bronze Medal";
            else res[idx] = String.valueOf(rank);

            rank++;
        }
        return res;
    }
}
