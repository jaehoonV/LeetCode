class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k / 2; i++) {
            int top = x + i;
            int bottom = x + k - 1 - i;
            for (int j = 0; j < k; j++) {
                int temp = grid[top][y + j];
                grid[top][y + j] = grid[bottom][y + j];
                grid[bottom][y + j] = temp;
            }
        }
        return grid;
    }
}