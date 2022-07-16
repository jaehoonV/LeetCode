class Solution {
    public boolean canBeIncreasing(int[] nums) {
        
        if(nums.length<=2) return true;
        
        boolean check = false;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                if(check) return false;
            
                check = true;
        
                if(i > 1 && nums[i] <= nums[i - 2]){
                    nums[i] = nums[i - 1];
                }
            }
        }    
        return true;   
    }
}