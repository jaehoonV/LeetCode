class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long output = 0;
        for(int i = 0; i < n; i++){
            output += nums[i];
        }
        n--;
        while(n > 0){
            if(nums[n] < output - nums[n]) break;
            output -= nums[n--];
        }
        
        if(n < 2) return -1;
        
        return output;
    }
}