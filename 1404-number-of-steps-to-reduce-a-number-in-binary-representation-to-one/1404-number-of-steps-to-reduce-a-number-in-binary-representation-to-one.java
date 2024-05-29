class Solution {
    public int numSteps(String s) {
        int output = 0, i = s.length() - 1, temp = 0;
        
        
        while(i > 0){
            int c = s.charAt(i) -'0';
            if(c == 0 && temp == 0){
                output++;
            }else if(c == 1 && temp == 1){
                output++;
                temp = 1;
            }else{
                output += 2;
                temp = 1;
            }
            i--;
        }
        
        return temp == 1 ? output + 1 : output;
    }
}