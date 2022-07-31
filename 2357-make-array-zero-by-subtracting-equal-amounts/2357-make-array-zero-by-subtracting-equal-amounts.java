class Solution {
    public int minimumOperations(int[] nums) {
        int[] temp = nums;
        int t = Arrays.stream(nums).sum();
        int cnt = 0;
        while(t != 0){
            t = 0;
            int min = Integer.MAX_VALUE;
            for(int i=0; i < temp.length; i++){
                if(nums[i] != 0){
                    min = Math.min(min, nums[i]);
                }
            }
            
            for(int i=0; i < temp.length; i++){
                if(nums[i] != 0){
                    nums[i] -= min;
                }
                t += nums[i];
            }
            cnt++;
        }
        return cnt;
    }
}