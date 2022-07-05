class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums); // 정렬
        
        int output = 0;
        int temp = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){ // 중복이면 continue
                continue;
            } else if(nums[i] == nums[i - 1] + 1){ // 순차적이면 temp++
                temp++;
            } else{ // 아니면 최대값 저장하고 temp 초기화
                output = Math.max(output, temp); 
                temp = 1;
            }
        }
        return Math.max(output, temp);
    }
}