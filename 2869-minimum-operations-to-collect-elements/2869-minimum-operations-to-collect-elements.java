class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int[] temp = new int[51];
        int n=nums.size();
        
        for(int i = n - 1; i >= 0; i--) {
            temp[nums.get(i)]++;
            int cnt=0;
            for(int j=1;j<=k;j++) {
                if(temp[j] > 0) cnt++;
            }
            
            if(cnt == k) return n-i;
            
        }
        return n;
    }
}