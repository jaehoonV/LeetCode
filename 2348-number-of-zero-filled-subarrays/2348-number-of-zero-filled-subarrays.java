class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long output = 0;
        int temp = 1;
        for(int n : nums){
            if(n == 0){
                output += temp;
                temp++;
            }else{
                temp = 1;
            }
        }
        return output;
    }
}