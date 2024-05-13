class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int sum = sum_func(grid, m, n);
		
        for(int i = 0; i < m; i++){
            int[][] temp = new int[m][n];
            for (int t = 0; t < m; t++) {
                temp[t] = grid[t].clone();
            }
            for(int j = 0; j < n; j++){
                if(temp[i][j] == 0) temp[i][j] = 1;
                else temp[i][j] = 0;
            }
            
			int temp_sum = sum_func(temp, m, n);
			
			if(temp_sum > sum) {
				sum = temp_sum;
				grid = temp.clone();
			}
        }
		
		for(int i = 0; i < n; i++){
            int[][] temp = new int[m][n];
            for (int t = 0; t < m; t++) {
                temp[t] = grid[t].clone();
            }
            for(int j = 0; j < m; j++){
                if(temp[j][i] == 0) temp[j][i] = 1;
                else temp[j][i] = 0;
            }
			int temp_sum = sum_func(temp, m, n);
			
			if(temp_sum > sum) {
				sum = temp_sum;
				grid = temp.clone();
			}
        }
        
		return sum;
    }
    
    public int sum_func(int[][] grid, int m, int n) {
        int sum = 0;
        for(int i = 0; i < m; i++){
			String s = "";
			for(int j = 0; j < n; j++){
				s += grid[i][j];
			}
			sum += Integer.parseInt(s, 2);
		}
		
		return sum;
    }
}