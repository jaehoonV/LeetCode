class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < x.length; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i], 0), y[i]));
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : map.values()) {
            pq.add(val);
        }

        if(pq.size() < 3) return -1;

        int output = 0;
        for(int i = 0; i < 3; i++) {
            output += pq.poll();
        }

        return output;
    }
}