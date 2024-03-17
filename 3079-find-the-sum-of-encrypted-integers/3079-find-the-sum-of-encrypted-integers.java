class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int output = 0;
        
        for(int n : nums){
            int a = 0, b = 0, temp = 0;
            int max = 0;
            while(n > 0){
                max = Math.max(max, n % 10);
                a++;
                n /= 10;
            }
            
            while(b < a){
                temp *= 10;
                temp += max;
                b++;
            }
            output += temp;
        }
        return output;
    }
}