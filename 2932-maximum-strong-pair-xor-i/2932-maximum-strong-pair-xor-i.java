class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n = nums.length;
        int output = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int x = nums[i];
                int y = nums[j];
                if(Math.abs(x - y) <= Math.min(x, y)) output = Math.max(output, nums[i]^nums[j]);
            }
        }
        return output;
    }
}