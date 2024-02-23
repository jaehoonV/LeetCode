class Solution {
    public int maxOperations(int[] nums) {
        int output = 1, i = 3, n = nums.length, sum = nums[0] + nums[1];
        
        while(i < n){
            if(sum == nums[i - 1] + nums[i]) output++;
            else break;
            
            i += 2;
        }
        return output;
    }
}