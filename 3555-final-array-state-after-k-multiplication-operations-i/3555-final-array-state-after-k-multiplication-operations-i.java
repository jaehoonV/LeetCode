class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        while(k > 0){
            int index = 0, value = nums[0];
            
            for(int j = 1; j < n; j++){
                if(value > nums[j]){
                    index = j;
                    value = nums[j];
                }
            }
            nums[index] = value * multiplier;
            k--;
        }
        return nums;
    }
}