class Solution {
    public boolean increasingTriplet(int[] nums) {
        int temp_i = Integer.MAX_VALUE; // 첫번째 저장 변수
        int temp_j = Integer.MAX_VALUE; // 두번째 저장 변수
        
        for(int n : nums) {
            if(n <= temp_i) {
                temp_i = n;
            } else if(n <= temp_j) {
                temp_j = n;
            } else {
                return true;
            }
        }
       return false;
    }
}