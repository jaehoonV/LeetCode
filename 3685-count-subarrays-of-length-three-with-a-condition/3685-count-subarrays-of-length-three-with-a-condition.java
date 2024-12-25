class Solution {
    public int countSubarrays(int[] nums) {
        int output = 0, n = nums.length;

        for(int i = 0; i < n - 2; i++){
            if((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) output++;
        }
        return output;
    }
}