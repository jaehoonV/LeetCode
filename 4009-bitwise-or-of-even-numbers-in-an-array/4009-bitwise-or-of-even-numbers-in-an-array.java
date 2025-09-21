class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int output = 0;
        for(int n : nums) {
            if(n % 2 == 0) output |= n;
        }
        return output;
    }
}