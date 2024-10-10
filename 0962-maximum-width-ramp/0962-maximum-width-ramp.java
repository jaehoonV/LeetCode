class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length, output = 0, min_i = Integer.MAX_VALUE;
        int[][] ramp_arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			ramp_arr[i][0] = i;
			ramp_arr[i][1] = nums[i];
		}

		Arrays.sort(ramp_arr, (a, b) -> Integer.compare(a[1], b[1]));

		for (int[] pair : ramp_arr) {
			int i = pair[0];
			output = Math.max(output, i - min_i);
			min_i = Math.min(min_i, i);
		}

		return output;
    }
}