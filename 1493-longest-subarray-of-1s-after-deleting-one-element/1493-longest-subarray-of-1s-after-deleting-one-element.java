class Solution {
    public int longestSubarray(int[] nums) {
        int output = 0;
        int a = 0, b = 0, c = 0, n1 = 0;
        
        for(int n : nums){
            if(n == 1){
                n1++;
                b++;
            }else{
                c++;
            }
            
            if(n == 0 && c > 0){
                if(a != 0){
                    output = Math.max(output, a + b);
                }
                a = b;
                b = 0;
                c = 0;
            }
        }
        return n1 == nums.length ? n1 - 1 : Math.max(output, a + b);
    }
}