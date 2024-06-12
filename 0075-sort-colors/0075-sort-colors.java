class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        while(true){
			boolean b = true;
			for(int i = 0; i < n - 1; i++){
				if(nums[i] > nums[i + 1]){
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					b = false;
				}
			}
			if(b) break;
		}
    }
}