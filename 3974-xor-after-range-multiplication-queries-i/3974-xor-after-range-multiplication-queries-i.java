class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] q : queries) {
            int a = q[0], b = q[1], c = q[2], d = q[3];
            while(a <= b){
                nums[a] = (int)(((long)nums[a] * d) % 1000000007);
                a += c;
            }
        }
        
        int output = 0;
        for(int n : nums) {
            output ^= n;
        }
        
        return output;
    }
}