class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0, l = 0;
        long t = 0, output = 0;

        for(int n : nums){
            max = Math.max(max, n);
        }
        
        for(int r = 0; r < nums.length; r++) {
            if(nums[r] == max) t++;
            
            while (t >= k) {
                if(nums[l] == max) t--;
                l++;
            }
            output += l;
        }
        return output;
    }
}