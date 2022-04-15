class Solution {
    public boolean isHappy(int n) {
      int temp = n;

		if (n <= 0)
			return false;
		if (n == 1)
			return true;

		while (true) { // 반복
			temp = func(temp);
			if (temp == 1)
				return true;
			if (temp == 37) // 37 무한 반복
				return false;
		}
	}

	public static int func(int temp) {
		int x = 0;
		while (temp > 0) {
			x += (temp % 10) * (temp % 10);
			temp /= 10;
		}
		return x;
	}
    
}