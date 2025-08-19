class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long output = 0;
        int t = 1;
        for(int n : nums){
            if(n == 0){
                output += t;
                t++;
            }else{
                t = 1;
            }
        }
        return output;
    }
}