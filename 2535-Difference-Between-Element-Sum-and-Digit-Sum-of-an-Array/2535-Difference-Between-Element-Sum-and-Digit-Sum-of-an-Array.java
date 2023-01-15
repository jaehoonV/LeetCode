class Solution {
    public int differenceOfSum(int[] nums) {
        int e = 0;
        int d = 0;
        
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            e += n;
            if(n >= 10){
                while(n > 0){
                    d += n % 10;
                    n /= 10;
                }
            } else{
                d += n;
            }
        }
        return e - d;
    }
}