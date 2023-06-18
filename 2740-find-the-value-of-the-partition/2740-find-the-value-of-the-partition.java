class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int output = nums[1] - nums[0];
        
        for (int i = 2; i < n; i++){
            output = Math.min(output, nums[i] - nums[i - 1]);
        }
        return output;
    }
}