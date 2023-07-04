class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        
        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            Integer key = iter.next();
            if(map.get(key) != 3) return key;
        }
        return 0;
    }
}