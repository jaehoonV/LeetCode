class Solution {
    public int[] countBits(int n) {
        int output[] = new int[n + 1]; 
        
        for(int i = 0; i <= n; i++){
            output[i] = func(i);
        }
        return output;
    }
    public int func(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        if(n % 2 == 0) return func(n / 2);
        else return 1 + func(n / 2);
    }
}