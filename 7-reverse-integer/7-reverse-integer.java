class Solution {
    public int reverse(int x) {
		int output = 0;
		int sign = 1;
		int temp = 0;

		// 부호 저장, 입력값 양수로 저장
		if(x < 0) {
			sign = -1;
		}
			
		x *= sign;
		
		// reverse integer
		while(x > 0) {
			temp = x % 10;
			x /= 10;
			if(output > (Integer.MAX_VALUE - temp) / 10 ) {
				return 0;
			}
            output = output * 10 + temp;
		}
		
		// 부호 붙여서 출력
		return output * sign;
    }
}