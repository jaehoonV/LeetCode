class Solution {
    public int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> map = new HashMap<>();
		return coinChange(coins, amount, map);
	}

	private int coinChange(int[] coins, int amount, Map<Integer, Integer> mem) {
		if (amount < 0) // amount가 0이 안될 경우 -1 반환
			return -1;
		if (amount == 0) // amount가 0이되면 output 반환
			return 0;
		
		// amount의 value값이 없을 경우가 있으므로 int가 아닌 Integer로 선언
		Integer temp = mem.get(amount); 
		
		if (temp != null)
			return temp;
		
		int count = -1;
		for (int i = 0; i < coins.length; i++) {
			int coin = coinChange(coins, amount - coins[i], mem); // 재귀함수
			// count가 0보다 작을 경우 count = coin + 1, 크거나 같을 경우 count, coin+1값 중 작은 값을 가짐
			if (coin >= 0) count = count < 0 ? coin + 1 : Math.min(count, coin + 1);
		}
		mem.put(amount, count); // hashmap에 amount를 key로 count를 value값으로 저장
		return count;
	}
}