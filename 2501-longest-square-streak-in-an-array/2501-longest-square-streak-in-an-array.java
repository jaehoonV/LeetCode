class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int output = 1;
        for(int n : nums) set.add(n);
        
        for(int n : nums){
            int cnt = 1;
            
            while(n < 1000){
                int t = n * n;
                if(set.contains(t)){
                    cnt++;
                    n = t;
                }else break;
            }
            output = Math.max(output, cnt);
        }
        
        return output < 2 ? -1 : output;
    }
}