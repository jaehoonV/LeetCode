class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
		int output = 0, temp = nums[0];
		
		for(int i = 1; i < nums.length; i++){
			if(temp >= nums[i]){
				output += (temp - nums[i] + 1);
				temp++;
			}else{
				temp = nums[i];
			}
		}
		return output;
    }
}