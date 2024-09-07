class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int output = 0;
        int i = 0;
        
        while(i < 4){
            int n1 = num1 % 10;
            int n2 = num2 % 10;
            int n3 = num3 % 10;
            
            int min = Math.min(Math.min(n1, n2), n3);
            int t = 1;
            
            for(int j = 0; j < i; j++){
                t *= 10;
            }
            output += min * t;
            
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            i++;
        }
        
        return output;
    }
}