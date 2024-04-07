class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length, output = 0, cnt = 1, temp = nums[0];
        
        for(int i = 1; i < n; i++){
            if(temp < nums[i]) cnt++;
            else{
                output = Math.max(output, cnt);
                cnt = 1;
            }
            temp = nums[i];
        }
        output = Math.max(output, cnt);
        temp = nums[n - 1];
        cnt = 1;
        for(int i = n - 2; i >= 0; i--){
            if(temp < nums[i]) cnt++;
            else{
                output = Math.max(output, cnt);
                cnt = 1;
            }
            temp = nums[i];
        }
        output = Math.max(output, cnt);
        return output;
    }
}