class Solution {
    public boolean canJump(int[] nums) {
        
        int step = nums.length-1; // 마지막 index
        
        for(int i = nums.length-1; i >= 0; i--){
            if(i + nums[i] >= step) step = i; // step 줄이기
        }
        
        // step이 0이 아닐 경우 마지막 index에 도달하지 못함으로 false 반환
        return step == 0; 
    }
}