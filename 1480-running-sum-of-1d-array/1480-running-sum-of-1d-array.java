class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        output[0] = nums[0];
        
        for(int i = 1; i < n; i++){
            output[i] = nums[i] + output[i - 1];
        }
        
        return output;
    }
}