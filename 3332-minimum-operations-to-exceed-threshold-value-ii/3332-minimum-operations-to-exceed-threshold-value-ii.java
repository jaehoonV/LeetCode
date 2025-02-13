class Solution {
    public int minOperations(int[] nums, int k) {
        int output = 0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        
        for(int n : nums){
            pq.add((long)n);
        }

        long x = 0, y = 0;
        while(pq.peek() < k){
            x = pq.poll();
            if(!pq.isEmpty()){                
                y = pq.poll();
                pq.add((long)x * 2 + y);
                output++;
            }else{
                break;
            }
            
        }

        return output;
    }
}