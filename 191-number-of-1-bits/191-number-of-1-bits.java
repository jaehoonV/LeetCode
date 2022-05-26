public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
		while (n != 0) {
			n &= (n - 1);
			cnt++;
		}

		// 1011 & 1010 = 1010 : 1
		// 1010 & 1001 = 1000 : 2
		// 1000 & 0111 = 0000 : 3
		// 비트 연산 &
		// & 두 비트 모두가 1인 경우에만 1이 됨

		return cnt;
    }
}