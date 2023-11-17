class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
		int i = 0;
		int j = n - 1;
		int[] arr = new int[n / 2];
		Arrays.sort(nums);
		
		while(i < j){
			arr[i] = nums[i] + nums[j];
			i++;
			j--;
		}
		
		return Arrays.stream(arr).max().getAsInt();
    }
}