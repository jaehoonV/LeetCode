class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
		int left_1 = 1001;
		int left_2 = 1001;

		for (int n : nums) {
			sum += n;
			if (n % 3 == 1) { 
				left_2 = Math.min(left_1 + n, left_2);
				left_1 = Math.min(left_1, n); 
			} else if (n % 3 == 2) {
				left_1 = Math.min(left_1, left_2 + n);
				left_2 = Math.min(left_2, n);
			}
		}

		if (sum % 3 == 1) return sum - left_1;
		if (sum % 3 == 2) return sum - left_2;

		return sum;
    }
}