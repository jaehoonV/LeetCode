class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long output = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> value_map = new HashMap<>();
        
        for(int i = 0; i < roads.length; i++){
            int a = roads[i][0];
            int b = roads[i][1];
            
            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        for (Integer key : keySet) {
            output += ((long)map.get(key) * n--);
        }
        
        return output;
        
    }
}