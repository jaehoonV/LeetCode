class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int output[] = new int[n];
        for(int i = 0; i < n; i++) {
            int a = nums.get(i);
            if(a != 2) output[i] = a - ((a + 1) & (-a - 1)) / 2;
            else output[i] = -1;
        }  
        return output;
    }
}