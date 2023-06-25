class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                String strNum = Integer.toString(nums[i]);
                int a = strNum.charAt(0) - '0';
                int b = nums[j] % 10;
                if(gcd(a, b)) cnt++;
            }    
        }
        return cnt;
    }
    
    public boolean gcd(int a, int b){
        int max = 0;
		
		for(int i = 1; i <= a && i <= b; i++){
			if(a % i == 0 && b % i == 0) max = i;
		}
        if(max > 1) return false;
        
        return true;
    }
}