class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int temp = nums[nums.length/2];
        int output = 0;
        
	    for (int num: nums) {
            output += Math.abs(temp - num);
        }
        
        return output;
    }
}