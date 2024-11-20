class Solution {
    public int takeCharacters(String s, int k) {
        int[] count = new int[3];
        int n = s.length();
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        if (Math.min(Math.min(count[0], count[1]), count[2]) < k) return -1;
        
        int output = Integer.MAX_VALUE;
        int a = 0;
        for (int b = 0; b < n; b++) {
            count[s.charAt(b) - 'a']--;
            
            while (Math.min(Math.min(count[0], count[1]), count[2]) < k) {
                count[s.charAt(a) - 'a']++;
                a++;
            }
            output = Math.min(output, n - (b - a + 1));
        }
        return output;
    }
}