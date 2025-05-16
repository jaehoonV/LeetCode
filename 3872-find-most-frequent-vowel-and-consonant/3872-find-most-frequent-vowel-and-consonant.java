class Solution {
    public int maxFreqSum(String s) {
        boolean[] temp = new boolean[26];
        for(char c : new char[]{'a', 'e', 'i', 'o', 'u'}) {
            temp[c - 'a'] = true;
        }
        
        int[] a = new int[26];
        int[] b = new int[26];
        
        for(char c : s.toCharArray()) {
            int i = c - 'a';
            if(temp[i]) {
                a[i]++;
            }else {
                b[i]++;
            }
        }
        
        int max_a = 0, max_b = 0;
        
        for(int i = 0; i < 26; i++) {
            max_a = Math.max(max_a, a[i]);
            max_b = Math.max(max_b, b[i]);
        }
        
        return max_a + max_b;
    }
}