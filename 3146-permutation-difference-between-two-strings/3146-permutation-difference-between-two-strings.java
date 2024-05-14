class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();
        int output = 0;
        
        for(int i = 0; i < s.length(); i++){
            s_map.put(s.charAt(i), i);
        }
        
        for(int i = 0; i < t.length(); i++){
            t_map.put(t.charAt(i),i);
        }
        
        for(char c : s_map.keySet()){
            output = output + Math.abs(s_map.get(c) - t_map.get(c));
        }
        
        return output;
    }
}