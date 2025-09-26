class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int output = 0;

        for(int i = n - 1; i >= 2; i--){
            int l = 0;
            int r = i - 1;
            while(l < r){
                if(nums[l] + nums[r] > nums[i]){
                    output += r - l;
                    r--;
                }else{
                    l++;
                }
            }
        }

        return output;
    }
}