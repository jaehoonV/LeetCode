class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] output = new int[n];
        
        if(k < 0){
            k *= -1;
            for(int i = 0; i < n; i++){
                int sum = 0;
                int j = 1;
                while(j <= k){
                    int t = i - j;
                    if(t < 0) t = n + t;
                    sum += code[t];
                    j++;
                }
                output[i] = sum;
            }
        }else if(k > 0){
            for(int i = 0; i < n; i++){
                int sum = 0;
                int j = 1;
                while(j <= k){
                    int t = i + j;
                    if(t >= n) t = t - n;
                    sum += code[t];
                    j++;
                }
                output[i] = sum;
            }
        }
        
        return output;
    }
}