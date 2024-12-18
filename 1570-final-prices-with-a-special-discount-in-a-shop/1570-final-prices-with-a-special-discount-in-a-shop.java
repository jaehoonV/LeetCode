class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
		int[] output = new int[n];

		for (int i = 0; i < n; i++) {
			output[i] = prices[i];
			for (int j = i + 1; j < n; j++) {
				if (prices[j] <= prices[i]) {
					output[i] -= prices[j];
					break;
				}
			}
		}

		return output;
    }
}