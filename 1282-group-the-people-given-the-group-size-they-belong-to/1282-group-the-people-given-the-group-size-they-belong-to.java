class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> output = new ArrayList<>();
        
        for(int i = 0; i < g.length; i++){
            hm.put(i, g[i]);
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(hm.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        
        List<Integer> temp = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : entryList){
            temp.add(entry.getKey());
            if(temp.size() == entry.getValue()){
                output.add(temp);
                temp = new ArrayList<>();
            }
        }
        return output;
    }
}