class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long output = 0;
        int i = 0, j = nums.length - 1;
        
        while(i <= j){
            String temp = "";
            if(i == j){
                temp = Integer.toString(nums[i]);
            }else{
                temp = Integer.toString(nums[i]) + Integer.toString(nums[j]);
            }
            i++;
            j--;
            output += Integer.parseInt(temp);
        }
        return output;
    }
}