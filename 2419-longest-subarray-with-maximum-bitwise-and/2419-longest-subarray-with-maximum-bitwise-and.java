class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, cnt = 0, output = 0, n = nums.length;
        
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
        }
        
        for(int i = 0; i < n; i++){
            if(max == nums[i]) cnt++;
            else{
                output = Math.max(output, cnt);
                cnt = 0;
            }
        }
        
        output = Math.max(output, cnt);
        
        return output == 0 ? 1 : output;
    }
}