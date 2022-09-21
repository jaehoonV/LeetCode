class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] output = new int[nums.length];
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0) sum += nums[i];
        }
        
        for(int i = 0; i < queries.length; i++){
            int temp = nums[queries[i][1]] + queries[i][0];
            if(temp % 2 == 0 && Math.abs(nums[queries[i][1]] % 2) == 1) {
                output[i] = sum + temp;
            } else if(temp % 2 == 0 && nums[queries[i][1]] % 2 == 0){
                output[i] = sum + queries[i][0];
            } else if(Math.abs(temp % 2) == 1 && nums[queries[i][1]] % 2 == 0){
                output[i] = sum - nums[queries[i][1]];
            } else{
                output[i] = sum;
            }
            
            sum = output[i];
            nums[queries[i][1]] = temp;
        }
        return output;
    }
}