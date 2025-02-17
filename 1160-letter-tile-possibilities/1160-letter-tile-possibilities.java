class Solution {
    public int numTilePossibilities(String tiles) {
        int[] n = new int[26];
        for (char c : tiles.toCharArray()) {
            n[c - 'A']++;
		}
        return backtrack(n);
    }
    
    private int backtrack(int[] n) {
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (n[i] > 0) {
                n[i]--;
                cnt += 1 + backtrack(n);
                n[i]++;
            }
        }
        return cnt;
    }
}