class Solution {
    public int minDeletions(String s) {
        int cnt = 0;
        
        // char => HashMap
        Map<Character, Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        // HashMap(value) => PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char c : hm.keySet()){
            pq.add(hm.get(c));
        }
        
        // Integer Duplicate Check
        while(!pq.isEmpty()){
            int a = pq.poll();
            if(pq.peek() == null || pq.peek() == 0){
                break;
            }
            int b = pq.poll();
            
            if(a == b){
                pq.add(a);
                pq.add(b - 1);
                cnt++;
            } else {
                pq.add(b);
            }
        }
        return cnt;
    }
}