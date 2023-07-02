class Solution {
    int output = 0;
    
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] <= threshold){
                func(1, nums, i, threshold);
            }
        }
        
        return output;
    }
    
    public void func(int cnt, int[] nums, int i, int threshold){
        while(i + 1 < nums.length){
            if(nums[i] % 2 != nums[i + 1] % 2 && nums[i + 1] <= threshold){
                cnt++;
                i++;
            }else{
                break;
            }
        }
        output = Math.max(output, cnt);
    }
}