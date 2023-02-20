class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int output = n; 
		for(int i = 0; i < n; i++ ) {
			if(target <= nums[i]) {
				output = i;
				break;
			}
		}
        return output;
    }
}