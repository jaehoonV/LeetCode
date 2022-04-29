class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
		int n = grid[0].length;
		int[] list = new int[m * n];
		int a = 0;
		
		// grid 일차원 배열로 변환
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				list[a++] = grid[i][j];
			}
		}

		Arrays.sort(list); // 정렬
		
		int median = list[(list.length - 1) / 2]; // 중간 값
        int cnt = 0; // count
        
        for (int num : list) {
            if (num == median) { // 같을 경우 continue
                continue;
            }
            
            // 중간 값과의 차이를 x로 나눴을 때 나머지가 0이 아니면 -1 반환
            if (Math.abs(num - median) % x != 0) { 
                return -1;
            }
            
            cnt += (Math.abs(num - median) / x); // 모두 나눠질때 몫을 cnt에 더해줌
        }
        
        return cnt;
		
	}
}