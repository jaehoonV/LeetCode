class Solution {
    public int pivotInteger(int n) {
        for(int i = 0; i <= n; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j <= i; j++){
                sum1 += j;
            }
            for(int k = i; k <= n; k++){
                sum2 += k;
            }
            if(sum1 == sum2) return i;
        }
        return -1;
    }
}