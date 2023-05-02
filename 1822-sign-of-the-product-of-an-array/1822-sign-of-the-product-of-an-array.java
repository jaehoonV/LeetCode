class Solution {
    public int arraySign(int[] nums) {
        int cnt = 0;
        for(int n : nums){
            if(n < 0) cnt++;
            if(n == 0) return 0;
        }
        
        return cnt % 2 == 0 ? 1 : -1;
    }
}