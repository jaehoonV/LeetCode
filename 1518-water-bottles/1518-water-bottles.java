class Solution {
    public int numWaterBottles(int b, int e) {
        int output = b;
        while(b / e > 0){
            output += (b / e);
            b = (b / e) + (b % e);
        }
        
        return output;
    }
}