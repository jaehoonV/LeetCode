class Solution {
    public int minPairSum(int[] nums) {
        int output = 0;
		int i = 0;
		int j = nums.length - 1;
		Arrays.sort(nums);
		
		while(i < j){
			output = Math.max(nums[i] + nums[j], output);
			i++;
			j--;
		}
		
		return output;
    }
}