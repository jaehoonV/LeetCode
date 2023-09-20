class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int temp = 0, cnt = 0, n = nums.size();
        for(int i = 1; i < n; i++){
            if(nums.get(i - 1) > nums.get(i)){ 
                temp = i;
                cnt++;
            }
        }
        if(cnt > 1) return -1;
        
        if(temp == 0) return 0;
        
        return nums.get(n - 1) > nums.get(0) ? -1 : n - temp; 
    }
}