class Solution {
    public int countPartitions(int[] nums) {
        int l_sum = 0;
        int r_sum = 0;
        int n = nums.length;
        int output = 0;

        for(int i = 0; i < n; i++){
            r_sum += nums[i];
        }
        
        for(int i = 0; i < n - 1; i++){
            l_sum += nums[i];
            r_sum -= nums[i];
            if((l_sum - r_sum) % 2 == 0) output++;
        }
        
        return output;

    }
}