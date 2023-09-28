class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = nums.length;
        int[] output = new int[l];
        int i = 0, j = l - 1;
        
        for(int n : nums){
            if(n % 2 == 0) output[i++] = n;
            else output[j--] = n;
        }
        return output;
    }
}