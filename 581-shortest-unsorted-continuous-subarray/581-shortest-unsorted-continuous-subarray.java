class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp_nums = nums.clone();;
        Arrays.sort(temp_nums);
        
        int start = -1, end = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != temp_nums[i]) { // 처음 시작 index저장
                if(start == -1) {  
                    start = i;
                }
            end = i; // 마지막 index 저장
            }
        }
        if(start == end) return 0;
        return end-start+1;
    }
}