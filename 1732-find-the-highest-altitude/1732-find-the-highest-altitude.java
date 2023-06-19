class Solution {
    public int largestAltitude(int[] gain) {
        int output = 0;
        int temp = 0;
        for(int n : gain){
            temp = temp + n;
            output = Math.max(temp, output);
        }
        
        return output;
    }
}