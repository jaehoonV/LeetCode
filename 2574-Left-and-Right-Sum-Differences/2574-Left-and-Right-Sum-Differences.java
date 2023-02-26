class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] output = new int[n];
        
        leftsum[0] = 0;
        rightsum[n - 1] = 0;
        for(int i = 1; i < n; i++){
            leftsum[i] = leftsum[i - 1] + nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--){
            rightsum[i] = rightsum[i + 1] + nums[i + 1];
        }
        
        for(int i = 0 ; i < n; i++){
            output[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return output;
    }
}