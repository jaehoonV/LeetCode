class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int max = 0, min = 0;
        boolean b = true;
        
        for(int i = 0; i < nums.length; i++){
            if(prime(nums[i])){
                max = i;
                if(b){
                    min = i;
                    b = false;
                }
            }
        }
        
        return max - min;
    }
    
    public boolean prime(int n) {
		if(n < 2) return false;
		
		if(n == 2) return true;
        
		for(int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
        
		return true;
	}
    
}