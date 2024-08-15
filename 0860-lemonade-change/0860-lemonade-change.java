class Solution {
    public boolean lemonadeChange(int[] bills) {
        int b_5 = 0, b_10 = 0;
        
        for(int b : bills){
            if(b == 5) {
                b_5++;
            }else if(b == 10){
                if(b_5 > 0) {
                    b_5--;
                    b_10++;
                }
                else return false;
            }else if(b == 20){
                if(b_5 > 0 && b_10 > 0){
                    b_5--;
                    b_10--;
                }else if(b_5 > 2){
                    b_5 -= 3;
                }else {
                    return false;
                }
            }
        }
        
        return true;
    }
}