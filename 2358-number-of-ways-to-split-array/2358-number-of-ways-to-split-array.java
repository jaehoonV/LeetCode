class Solution {
    public int waysToSplitArray(int[] nums) {
        int output = 0;
		long left = 0;
		long right = 0;

        for (int num : nums) {
            right += num;
        }
		
		for(int i = 0; i < nums.length - 1; i++){
			left += nums[i];
			right -= nums[i];
			if(left >= right) output++;
		}
		return output;
    }
}