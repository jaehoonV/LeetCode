class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int output = 0;
        
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'a']);

                if (maxFreq >= k) {
                    output += n - j;
                    break;
                }
            }
        }
        
        return output;
    }
}
