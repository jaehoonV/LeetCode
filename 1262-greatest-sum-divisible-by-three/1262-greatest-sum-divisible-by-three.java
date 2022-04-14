class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0; // 합계
		int left_1 = 1001; // 3으로 나눈 나머지 1의 최소값 저장
		int left_2 = 1001; // 3으로 나눈 나머지 2의 최소값 저장

		for (int n : nums) {
			sum += n;

			if (n % 3 == 1) { 
				left_2 = Math.min(left_1 + n, left_2); // n을 더해서 나머지값을 맞추고 최소값을 저장
				left_1 = Math.min(left_1, n); 
			} else if (n % 3 == 2) {
				left_1 = Math.min(left_1, left_2 + n); // n을 더해서 나머지값을 맞추고 최소값을 저장
				left_2 = Math.min(left_2, n);
			}
		}

		if (sum % 3 == 1) // sum의 나머지가 1일 경우 left_1을 빼고 반환
			return sum - left_1;
		if (sum % 3 == 2) // sum의 나머지가 2일 경우 left_2을 빼고 반환
			return sum - left_2;

		return sum;
    }
}