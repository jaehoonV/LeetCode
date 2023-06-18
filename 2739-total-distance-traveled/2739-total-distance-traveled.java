class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        
        int output = 0;
        
        for(int i = 1; i <= mainTank; i++){
            if(additionalTank != 0 && i % 5 == 0){
                additionalTank--;
                output += 10;
                mainTank++;
            } else output += 10;
        }
        
        return output;
    }
}