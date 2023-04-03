class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // people 배열의 왼쪽, 오른쪽 index생성
		int left = 0;
		int right = people.length - 1;

		// 합해지는 값 temp, count하는 output 생성
		int temp = 0;
		int output = 0;

		Arrays.sort(people); // 1, 2, 2, 3

		while (left <= right) { // 모든 배열을 다 더했다면 false
			temp = people[left] + people[right]; // 변수에 정렬된 값의 왼쪽, 오른쪽 더 함

			if (limit >= temp) { // 합한 값이 limit보다 작거나 같을 경우
				left++; // left + 1
			}
			output++; // count
			right--; // right - 1
		}
        
        return output;
    }
}