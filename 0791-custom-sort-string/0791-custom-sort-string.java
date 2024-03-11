class Solution {
    public String customSortString(String order, String s) {
        StringBuilder output = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                for(int i = 0; i < map.get(c); i++){
                    output.append(String.valueOf(c));
                }
                map.remove(c);
            }
        }
        for (char c : map.keySet()) {
            for(int i = 0; i < map.get(c); i++){
                output.append(String.valueOf(c));
            }
        }
        return output.toString();
    }
}