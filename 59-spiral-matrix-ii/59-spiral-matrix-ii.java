class Solution {
    public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];

		int cnt = 1;
		int i = 0;
		int j = 0;
		int start = 0;
		int end = n;

		while (cnt <= n * n) {
			while (j < end ){
				answer[i][j++] = cnt++;
			}
			j--;
			i++;
			while( i < end) {
				answer[i++][j] = cnt++;
			}
			i--;
			while(j > start) {
				answer[i][--j] = cnt++;
			}
			start++;
			end--;
			while(i > start) {
				answer[--i][j] = cnt++;
			}
			j++;
		}

		return answer;
    }
}