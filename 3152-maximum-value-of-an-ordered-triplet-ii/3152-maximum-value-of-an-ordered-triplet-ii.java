class Solution {
    public long maximumTripletValue(int[] nums) {
        int temp = 0, diff = 0;
        long output = 0;
        
        for(int i = 0; i < nums.length; i++) {
            temp = Math.max(temp, nums[i]);
            if(i >= 2) output = Math.max(output, (long)diff * nums[i]);
            if(i >= 1) diff = Math.max(diff, temp - nums[i]);
        }
        
        return output;
    }
}