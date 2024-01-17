class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        
        for (int v : hm.values()) {
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
        }
  
        for (int v : cnt.values()) {
            if(v > 1) return false;
        }
        
        return true;
    }
}