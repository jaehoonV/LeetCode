class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> output = new ArrayList<>();
        
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        for(String word : words) {
            tm.put(word, tm.getOrDefault(word, 0) + 1);
        }
        
        int max = 0;
        for(int i : tm.values()){
            max = Math.max(i, max);
        }
        
        while(true){
            for(String s : tm.keySet()){
                if(k == output.size()) return output;
                if(tm.get(s) == max){
                    output.add(s);
                }
            }
            max--;
        }
    }
}