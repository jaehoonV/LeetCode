class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> hm = new HashMap<>();
        
        for (String s : words) {
            for (char c : s.toCharArray()) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
        }
        
        int n = words.length;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() % n != 0) return false;
        }
        
        return true;
    }
}