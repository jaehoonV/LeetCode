class Solution {
    public long maximumTripletValue(int[] nums) {
        long output = 0;
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp_k = 0;
                for(int k = j + 1; k < n; k++){
                    temp_k = Math.max(temp_k, nums[k]);
                }
                output = Math.max(output, (long)(nums[i] - nums[j]) * temp_k);
            }    
        }
        return output < 0 ? 0 : output;
    }
}