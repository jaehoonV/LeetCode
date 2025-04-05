class Solution {
    int output = 0; 
    int n = 0;
    
    public int subsetXORSum(int[] nums) {
        n = nums.length;
        dfs(nums, 0, output);
        return output;
    }
    
    public void dfs(int[] nums, int s, int a) {
        if(s >= n) return;
        
        for(int i = s; i < n; i++) {
            int temp = a ^ nums[i];
            output += temp;
            dfs(nums, i + 1, temp);
        }
    }
}