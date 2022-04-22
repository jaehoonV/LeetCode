class Solution {
    public int maxCoins(int[] piles) {
        int answer = 0;
		Arrays.sort(piles); // 정렬
		
		// ArrayList로 변환
		ArrayList<Integer> pilesList = new ArrayList<>(piles.length);
		for (int i : piles) {
			pilesList.add(i);
		}
		
		// 리스트가의 size가 0이 될 때까지 맨 처음과 맨 끝, 
		// 맨끝에서 2번째 값을 지우고 맨끝에서 2번째 값은 answer에 계속 더 함
		while (pilesList.size() > 0) { 
			pilesList.remove(0);
			pilesList.remove(pilesList.size() - 1);
			answer += pilesList.get(pilesList.size() - 1);
			pilesList.remove(pilesList.size() - 1);
		}

		return answer;
    }
}