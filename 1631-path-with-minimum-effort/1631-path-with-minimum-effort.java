class Solution {
    
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
		int[][] dist = new int[m][n]; // 해당 index까지의 effort값을 저장할 배열 생성
		for (int i = 0; i < m; i++)
			Arrays.fill(dist[i], 1000000); // 최대값으로 채움
		
		int[] DIR = new int[] { 0, 1, 0, -1, 0 }; // 방향

		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
		pq.add(new int[] { 0, 0, 0 }); // 맨처음 시작점(effort, 행, 열)
		while (!pq.isEmpty()) { // 반복
			int[] top = pq.poll(); /// 우선순위 큐 첫번째 값 반환
			int d = top[0], r = top[1], c = top[2];
			if (d > dist[r][c]) continue;
			if (r == m - 1 && c == n - 1) return d; // 도착 (우측 하단)값 반환
			for (int i = 0; i < 4; i++) {
				int nr = r + DIR[i], nc = c + DIR[i + 1]; // 방향(위, 아래, 양옆)
				if (nr >= 0 && nr < m && nc >= 0 && nc < n) { // 시작점과 배열의 길이를 넘지 않았을 경우
					int newDist = Math.max(d, Math.abs(heights[nr][nc] - heights[r][c])); // effort 비교
                    
					// newDist값이 작을 경우 해당 index의 effort값을 newDist값으로 변경하고 우선순위 큐에 값 추가
					if (dist[nr][nc] > newDist) {
						dist[nr][nc] = newDist;
						pq.add(new int[] { dist[nr][nc], nr, nc });
					}
				}
			}
		}
		return 0;
	}
}