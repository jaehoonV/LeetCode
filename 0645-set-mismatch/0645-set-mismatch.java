class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            if(output[nums[i] - 1] == 0){
                output[nums[i] - 1] = nums[i];
            } else{
                a = nums[i];
            }
        }
        
        for(int j = 0; j < n; j++){
            if(output[j] == 0){
                return new int[]{a, j + 1};
            }
        }
        return new int[]{0, 1};
    }
}