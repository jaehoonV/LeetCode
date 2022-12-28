class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int p : piles){
            pq.add(p);
        }
        
        while(k > 0 && !pq.isEmpty()){
            int temp = pq.poll();
            temp -= temp / 2;
            pq.add(temp);
            k--;
        }
        
        int sum = 0;
        while(!pq.isEmpty())sum += pq.poll();
        
        return sum;
    }
}