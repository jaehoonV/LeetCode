class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums[0];
        int t = 0;
        for(int i = 1; i < nums.length; i++){
            int a = nums[i];
            if(n == a) {
                t++;
            }else if(n != a && t == 0){
                break;
            }else{
                t = 0;
                n = a;
            }
        }
        return n;
    }
}