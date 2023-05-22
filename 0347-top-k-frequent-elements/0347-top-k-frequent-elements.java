class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        
        List<Integer> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys, (v1, v2) -> (hm.get(v2).compareTo(hm.get(v1)))); 
        
        int i = 0;
        for(Integer n : keys){
            if(i < k) output[i++] = n;
            else break;
        }
        
        return output;
    }
}