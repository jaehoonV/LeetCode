class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;

        while(s <= e){
            int m = s + (e - s) / 2;

            if(m * m == x){
                return m;
            }

            if((long) m * m > x)  e = m - 1;
            else s = m + 1;
            
        }

        return Math.round(e);
    }
}