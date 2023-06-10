class Solution {
    public int minimizedStringLength(String s) {
        boolean[] b = new boolean[26];
        int output = 0;

        for (char c : s.toCharArray())
          b[c - 'a'] = true;

        for (boolean t : b) if (t) output++;

        return output;
    }
}