class Solution {
    public boolean canAliceWin(int[] nums) {
        int a = 0, b = 0;
        for(int n : nums){
            if(n < 10) a += n;
            else b += n;
        }
        return a != b;
    }
}