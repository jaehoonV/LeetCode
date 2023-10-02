class Solution {
    public boolean winnerOfGame(String colors) {
        int a = 0, b = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            char c = colors.charAt(i);
            char p_c = colors.charAt(i - 1);
            char n_c = colors.charAt(i + 1);
            
            if (c == 'A' && p_c == 'A' && n_c == 'A') a++;
            else if (c == 'B' && p_c == 'B' && n_c == 'B') b++; 
        }
        return a > b;
    }
}