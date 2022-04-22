class Solution {
    public int maxCoins(int[] piles) {
        int answer = 0;
		Arrays.sort(piles); // 정렬
		
		// 더해지는 규칙 (3부터 시작 +2씩) 
        for (int i = piles.length / 3; i < piles.length; i += 2)
        	answer += piles[i];

		return answer;
    }
}