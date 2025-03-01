class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                output[j++] = nums[i];
            }
        }
        
        return output;
    }
}