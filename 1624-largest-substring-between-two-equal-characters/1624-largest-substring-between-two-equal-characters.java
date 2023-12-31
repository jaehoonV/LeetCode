class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int output = -1;
        for (int l = 0; l < s.length(); l++) {
            for (int r = l + 1; r < s.length(); r++) {
                if (s.charAt(l) == s.charAt(r)) {
                    output = Math.max(output, r - l - 1);
                }
            }
        }
        
        return output;
    }
}