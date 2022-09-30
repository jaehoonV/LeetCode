class Solution {
    public int removeDuplicates(int[] nums) {
        int output = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
               nums[output++] = nums[i];
            }
        }
        return output;
    }
}