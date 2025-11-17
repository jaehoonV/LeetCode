class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int temp = Integer.MIN_VALUE;
        int a = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                a = i;

                if(temp > -1 && a - temp - 1 < k){
                        return false;
                }

                temp = a;
             
            }
        }
        return true;
    }
}