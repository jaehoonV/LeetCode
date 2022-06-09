class Solution {
// 	Time Limit Exceeded
//	public int[] twoSum(int[] numbers, int target) {
//		int[] output = new int[2];
//
//		Loop: for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				if (numbers[i] + numbers[j] == target) {
//					output[0] = i + 1;
//					output[1] = j + 1;
//					break Loop;
//				}
//			}
//		}
//
//		return output;
//	}
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
		
		int left = 0, right = numbers.length - 1;
		
		while(left < right) {
			if (numbers[left] + numbers[right] > target) {
				right --;
	        } else if (numbers[left] + numbers[right] < target) {
	        	left ++;
	        } else {
				output[0] = left + 1;
				output[1] = right + 1;
				return output;
	        }
		}

		return output;
    }
}