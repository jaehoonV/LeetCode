class Solution {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        
        long n_t = n;
        if(n < 0) n_t = -n_t;
        
        double output = 1;
        double temp = x;
        
        while(n_t > 0){
            if(n_t % 2 == 1) {
                output *= temp;
                n_t--;
            }else{
                temp *= temp;
                n_t /= 2;
            }
        }

        return n < 0 ? (1.0) / output : output;
    }
}