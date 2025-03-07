class Solution {
    public int[] closestPrimes(int left, int right) {
		int min = 1000000;
		int temp = 0;
		int[] output = new int[]{-1, -1};
		for (int num = left; num <= right; num++) {
			if (isPrime(num)) {
				if(temp != 0){
					if(min > num - temp){
						min = num - temp;
						output[0] = temp;
						output[1] = num;
					}
				}
				temp = num;
			}
		}
		return output;
		
    }
	
	public boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}