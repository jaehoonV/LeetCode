class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> output = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int cnt = 0;
        int total = m * n;
        int sr = 0;
        int er = m - 1;
        int sc = 0;
        int ec = n - 1;
        
        while (cnt < total) {
            // Traverse top row from left to right
            for (int i = sc; cnt < total && i <= ec; i++) {
                output.add(matrix[sr][i]);
                cnt++;
            }
            sr++;
            
            // Traverse right column from top to bottom
            for (int i = sr; cnt < total && i <= er; i++) {
                output.add(matrix[i][ec]);
                cnt++;
            }
            ec--;
            
            // Traverse bottom row from right to left
            for (int i = ec; cnt < total && i >= sc; i--) {
                output.add(matrix[er][i]);
                cnt++;
            }
            er--;
            
            // Traverse left column from bottom to top
            for (int i = er; cnt < total && i >= sr; i--) {
                output.add(matrix[i][sc]);
                cnt++;
            }
            sc++;
        }
        
        return output;
    }
}