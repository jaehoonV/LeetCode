class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int output = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int temp1 = nums[i] + diff;
            if(IntStream.of(nums).anyMatch(x -> x == temp1)){
                int temp2 = temp1 + diff;
                if(IntStream.of(nums).anyMatch(x -> x == temp2)){
                    output++;
                }
            }
        }
        return output;
    }
}