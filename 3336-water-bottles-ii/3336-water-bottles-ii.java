class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int output = numBottles;
        while(numBottles >= numExchange){
            output++;
            numBottles -= numExchange;
            numExchange++;
            numBottles++;
        }
        
        return output;
    }
}