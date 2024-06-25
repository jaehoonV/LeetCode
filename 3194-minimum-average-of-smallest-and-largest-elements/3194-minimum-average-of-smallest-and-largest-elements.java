class Solution {
    public double minimumAverage(int[] nums) {
        double output = Double.MAX_VALUE;
		int i = 0, j = nums.length - 1;
		Arrays.sort(nums);
		while(i < j){
			double temp = ((double) nums[i++] + nums[j--]) / 2;
			output = Math.min(output, temp);
		}
		return output;
    }
}