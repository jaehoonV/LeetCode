class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        
        while(n > 1){
            if(nums[n - 2] + nums[n - 1] > nums[n]) {
                return nums[n - 2] + nums[n - 1] + nums[n];
            }
            n--;
        }
        return 0;
    }
}