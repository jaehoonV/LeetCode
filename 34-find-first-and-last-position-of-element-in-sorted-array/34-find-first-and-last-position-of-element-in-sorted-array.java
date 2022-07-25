class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length == 1 && nums[0] == target){
            return new int[]{0,0};
        }
        
        int i = 0;
        int j = 0;
        while(i < nums.length){
            if(nums[i] == target){
                j = i;
                while(j < nums.length){
                    if(nums[j] > target){
                        return new int[]{i,j-1};
                    }
                    j++;
                }
                if(j == nums.length){
                    return new int[]{i,j-1};
                }
            }
            if(nums[i] > target) break;
            i++;
        }
        return new int[]{-1,-1};
    }
}