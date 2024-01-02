class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int output = 0;
        for(int n : nums){
            String s = Integer.toBinaryString(n);
            int leng = s.length();
            if(leng >= 2 && s.charAt(leng - 1) == '0') output++;
            
            if(output > 1) return true;
        }
        
        return false;
    }
}