class Solution {
    public int longestSubarray(int[] nums, int limit) {    
        int n = nums.length;
        if(n == 1) return 1;
        int output = 0;
        for(int i = 0; i < n - 1; i++){
            int max = nums[i];
            int min = nums[i];
            for(int j = i + 1; j < n; j++){
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                
                if(Math.abs(max - min) <= limit){
                    output = Math.max(output, j - i + 1);
                }else{
                    break;
                }
            }
            if(output > n - i) break;
        }
        
        return output;
    }
}