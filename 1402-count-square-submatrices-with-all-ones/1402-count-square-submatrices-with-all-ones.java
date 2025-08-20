class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
		int m = matrix[0].length;
		int min = Math.min(n, m);
		int side = 1;
		int output = 0;
		
		while(side <= min){
			for(int i = 0; i < n; i++){
				if(n - i < side) break;
				for(int j = 0; j < m; j++){
					if(m - j < side) break;
					if(func(i, j, side, matrix)) output++;
					
				}
			}
			side++;
		}
		return output;
		
    }
	
	public boolean func(int i, int j, int side, int[][] matrix){
		for(int k = i; k < i + side; k++){
			for(int l = j; l < j + side; l++){
				if(matrix[k][l] != 1) return false;
			}
		}
		return true;
	}
}