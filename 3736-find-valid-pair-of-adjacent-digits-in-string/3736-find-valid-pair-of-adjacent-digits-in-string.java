class Solution {
    public String findValidPair(String s) {
        Map<Character, Integer> cnt = new HashMap<>();
        for (char c : s.toCharArray()) {
            cnt.put(c, cnt.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) && cnt.get(s.charAt(i)) == (s.charAt(i) - '0') && cnt.get(s.charAt(i - 1)) == (s.charAt(i - 1) - '0')) {
                return s.substring(i - 1, i + 1);
            }
        }

        return "";
    }
}