class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> output = new ArrayList<>();
        Map<Integer,Integer> tm1 = new TreeMap<>();
        Map<Integer,Integer> tm2 = new TreeMap<>();
        
        for(int i = 0; i < matches.length; i++){
            tm1.put(matches[i][0], tm1.getOrDefault(matches[i][0], 0) + 1);
            tm2.put(matches[i][1], tm2.getOrDefault(matches[i][1], 0) + 1);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for (Integer key1 : tm1.keySet()) {
            if(!tm2.containsKey(key1)) list1.add(key1);
        }
        output.add(list1);
        for(Integer key2 : tm2.keySet()){
            if(1 == tm2.get(key2)) {
                list2.add(key2);
            } 
        }
        output.add(list2);
        return output;
    }
}