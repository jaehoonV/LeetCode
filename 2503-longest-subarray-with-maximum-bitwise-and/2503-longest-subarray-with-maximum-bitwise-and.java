class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, cnt = 0, output = 0;
        
        for(int n : nums){
            max = Math.max(max, n);
        }
        
        for(int n : nums){
            if(max == n) cnt++;
            else{
                output = Math.max(output, cnt);
                cnt = 0;
            }
        }
        
        output = Math.max(output, cnt);
        
        return output == 0 ? 1 : output;
    }
}