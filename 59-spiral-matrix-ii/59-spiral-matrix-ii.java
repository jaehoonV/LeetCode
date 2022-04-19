class Solution {
    public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];

		int cnt = 1;
		int i = 0;
		int j = 0;
		int start = 0; // 시작 index
		int end = n; // 끝 index

		while (cnt <= n * n) { // cnt가 n*n까지 반복
			while (j < end) { // 끝 index까지 cnt 1씩 증가하면서 저장
				answer[i][j++] = cnt++;
			}
			i++; // i, j값 조절
			j--;
			while (i < end) { // 끝 index까지 cnt 1씩 증가하면서 저장
				answer[i++][j] = cnt++;
			}
			i--; // i값 조절
			while (j > start) { // 시작 index까지 cnt 1씩 증가하면서 저장
				answer[i][--j] = cnt++;
			}
			start++; // 윗 줄과 옆 줄이 다 채워졌으므로 start +1, end -1
			end--;
			while (i > start) { // 시작 index까지 cnt 1씩 증가하면서 저장
				answer[--i][j] = cnt++;
			}
			j++; // j값 조절
		}

		return answer;
    }
}