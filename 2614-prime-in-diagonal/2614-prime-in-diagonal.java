class Solution {
    public int diagonalPrime(int[][] nums) {
        int output = 0;
        for(int i = 0;i < nums.length; i++){
            if(func(nums[i][i]))
                output = Math.max(output, nums[i][i]);
            
            if(func(nums[i][nums.length - i - 1]))
                output = Math.max(output, nums[i][nums.length - i - 1]);
        }
        return output;
    }
    
    boolean func(int a){
        if(a < 2) return false;
        
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0) return false;
        }
        return true;
    }
}