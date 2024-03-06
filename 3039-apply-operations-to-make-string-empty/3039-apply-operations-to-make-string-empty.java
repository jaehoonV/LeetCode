class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> cnt_map = new HashMap<>();
        HashMap<Character, Integer> index_map = new HashMap<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            index_map.put(s.charAt(i), i);
            cnt_map.put(s.charAt(i), cnt_map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int max_cnt = 0;
        for (int v : cnt_map.values()) {
            max_cnt = Math.max(max_cnt, v);
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (cnt_map.get(c) == max_cnt && index_map.get(c) == i) {
                output.append(c);
            }
        }
        return output.toString();
    }
}