class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        if(n == 0) return 0;
        
        int cnt = 1;
        boolean b = true;
        int i = 0;
        
        while(i < n - 1){
            if(nums[i] == nums[i + 1]){
                i++;
            } else if(nums[i] < nums[i + 1]){
                b = true;
                break;
            } else {
                b = false;
                break;
            }
        }
        
        while(i < n - 1){
            if(b){
                if(nums[i] < nums[i + 1]){
                    cnt++;
                    b = false;
                }
            } else{
                if(nums[i] > nums[i + 1]){
                    cnt++;
                    b = true;
                }   
            }
            i++;
        }
        return cnt;
    }
}