class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = -1, b = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(a == -1 && nums[i] == target){
                a = i;
            }else if(a == -1 && nums[i] > target) {
                break;
            }else if(a != -1 && nums[i] > target) {
                b = i - 1;
                break;
            }
        }
        
        if(a != -1 && b == -1) b = n - 1;
        
        return new int[]{a, b};
    }
}