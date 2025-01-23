class Solution {
    public int countServers(int[][] grid) {
        int a = grid.length, b = grid[0].length;
        int[] r = new int[a];
        int[] c = new int[b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                r[i] += grid[i][j];
                c[j] += grid[i][j];
            }
        }

        int output = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (grid[i][j] == 1 && (r[i] > 1 || c[j] > 1)) {
                    output++;
                }
            }
        }
        return output;
    }
}