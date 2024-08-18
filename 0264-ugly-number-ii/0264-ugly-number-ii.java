class Solution {
    public int nthUglyNumber(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        int t2 = 0, t3 = 0, t5 = 0;

        int[] temp = new int[n + 1];
        temp[0] = 1;

        for(int i = 1; i < n; i++) {
            int num = Math.min(temp[t2] * 2, Math.min(temp[t3] * 3, temp[t5] * 5));
            temp[i] = num;

            if(num == temp[t2] * 2) t2++;
            
            if(num == temp[t3] * 3) t3++;
            
            if(num == temp[t5] * 5) t5++;
            
        }

        return temp[n - 1];
    }
}