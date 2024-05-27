class Solution {
    public int specialArray(int[] nums) {
        int output = 0, l = nums.length;
		Arrays.sort(nums);
		int max = nums[l - 1];
		
		for(int i = 1; i <= max; i++){
			for(int j = 0; j < l; j++){
				if(nums[j] >= i){
					if(l - j == i) return i;
					break;
				}
			}
		}
        return -1;
    }
}