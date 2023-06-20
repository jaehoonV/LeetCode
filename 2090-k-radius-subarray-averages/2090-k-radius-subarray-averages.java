class Solution {
    public int[] getAverages(int[] nums, int k) {
        
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output, -1);
        
        int t = k * 2 + 1;
        if(n < t) return output;
        
        long sum = 0;
        int a = 0, b = k * 2;
        
        for(int i = a; i <= b; i++){
            sum += nums[i];
        }
        
        output[k] = (int)(sum / t);
        
        for(int i = k + 1; i < n - k; i++){
            sum = sum + nums[++b] - nums[a++];
            output[i] = (int)(sum / t);
        }
        
        return output;
    }
    
}