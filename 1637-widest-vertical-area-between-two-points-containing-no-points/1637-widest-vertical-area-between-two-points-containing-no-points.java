class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int output = 0;
        for (int[] point : points) {
            pq.add(point[0]);
        }

        int prev = pq.poll();
        
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            output = Math.max(output, prev - cur); 
            prev = cur;
        }

        return output;
    }
}