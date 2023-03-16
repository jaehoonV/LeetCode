class Solution {
    public int[] sumZero(int n) {
        int[] output = new int[n];
        int i = 0;
        int a = 1;
        if(n % 2 == 0){
            while(i < n){
                if(a < 0) {
                    output[i++] = a;
                    a = a * -1 + 1;
                }else{
                    output[i++] = a;
                    a *= -1;
                }
            }
        }else{
            output[i++] = 0;
            while(i < n){
                if(a < 0) {
                    output[i++] = a;
                    a = a * -1 + 1;
                }else{
                    output[i++] = a;
                    a *= -1;
                }
            }
        }
        return output;
    }
}