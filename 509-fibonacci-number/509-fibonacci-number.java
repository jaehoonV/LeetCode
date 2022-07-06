class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1 || n== 2) return 1;

        int a = 0;
        int b = 1;
        int i = 2;
        while(i <= n){
	        int output = a + b;
	        a = b;
	        b = output;
            i++;
        } 
        return b;
    }
}