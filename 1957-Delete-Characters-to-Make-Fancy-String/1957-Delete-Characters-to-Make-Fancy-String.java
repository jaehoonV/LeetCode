class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        if (n < 3)
            return s;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int sb_n = sb.length();
            if (sb_n >= 2 && sb.charAt(sb_n - 2) == sb.charAt(sb_n - 1) && sb.charAt(sb_n - 1) == s.charAt(i)) {
                continue;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}