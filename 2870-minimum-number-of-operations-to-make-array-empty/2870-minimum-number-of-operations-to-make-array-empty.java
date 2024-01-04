class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);

        int output = 0;
        int i = 0;
        while(i < nums.length){
            int j = i;
            while(j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            int cnt = j - i;
            if(cnt == 1) return -1;
            output += cnt / 3;

            if(cnt % 3 != 0) output++;
            i = j;
        }
        return output;
       
    }
}