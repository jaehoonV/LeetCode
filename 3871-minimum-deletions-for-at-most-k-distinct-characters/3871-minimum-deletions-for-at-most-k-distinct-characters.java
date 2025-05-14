class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0 ) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        
        Collections.sort(list);
        
        int output = 0, i = 0, n = list.size();
        while(k < n){
            output += list.get(i);
            i++;
            n--;
        }
        return output;
    }
}