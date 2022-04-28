class Solution {
    public int singleNumber(int[] nums) {
        //xor solution
        int ans =0;
        
        for(int n : nums)
        ans ^= n;
    
        return ans;
    }
}