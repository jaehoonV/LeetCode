class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean[] temp = new boolean[1001];
        
        for(int n : nums) {
            if(n <= 1000) temp[n] = true;
        }

        while(original <= 1000) {
            if(temp[original]) original *= 2;
            else break;
        }

        return original;
    }
}