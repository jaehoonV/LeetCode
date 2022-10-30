class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int cnt = 0;
        
        for(int n : nums){
            if(n % 3 == 0 && n % 2 == 0){
                sum += n;
                cnt++;
            }
        }
        return sum == 0 ? 0 : sum / cnt;
    }
}