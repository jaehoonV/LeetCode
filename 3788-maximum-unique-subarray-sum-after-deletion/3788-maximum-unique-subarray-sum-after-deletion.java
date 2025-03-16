class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int temp = nums[n - 1];
        int output = nums[n - 1];
        
        for(int i = n - 2; i >= 0; i--){
            int a = nums[i];
            if(a > 0){
                if(temp != a){
                    output += a;
                    temp = a;
                }
            }else{
                break;
            }
        }

        return output;
    }
}