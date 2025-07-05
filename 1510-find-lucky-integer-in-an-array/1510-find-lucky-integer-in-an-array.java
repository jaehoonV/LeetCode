class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int output = -1;
        for(int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) == key) output = key;
        }
        
        return output; 
    }
}