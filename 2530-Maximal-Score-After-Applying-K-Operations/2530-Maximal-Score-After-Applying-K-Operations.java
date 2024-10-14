class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int n : nums) pq.add(n);
        
        long output = 0;
        while (k > 0) {
            k--;
            int temp = pq.poll();
            output += temp;
            pq.add((temp + 2) / 3);
        }
        return output;
    }
}