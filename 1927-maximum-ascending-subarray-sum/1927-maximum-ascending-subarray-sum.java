class Solution {
    public int maxAscendingSum(int[] nums) {
        int output = 0;

        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                temp += nums[i];
            }else{
                output = Math.max(temp, output);
                temp = nums[i];
            }
        }

        return Math.max(temp, output);
    }
}