class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean output = func(board, word, i, j, 0);
                    if (output) return output;
                }
            }
        }
        return false;
    }
    
    public static boolean func(char[][] board, String word, int row, int col, int idx) {
        if (idx == word.length()) return true;

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(idx)) return false;

        board[row][col] = '*';

        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, -1, 1 };

        for (int i = 0; i < c.length; i++) {
            boolean output = func(board, word, row + r[i], col + c[i], idx + 1);
            if (output == true) return output; 
        }

        board[row][col] = word.charAt(idx);
        return false;
    }
}