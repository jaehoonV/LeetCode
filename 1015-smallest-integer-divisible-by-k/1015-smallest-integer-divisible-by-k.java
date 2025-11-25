class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k == 1) return 1;
        if(k % 2 == 0 || k % 5 == 0) return -1;

        int t = 0;
        for(int i = 1; i <= k; i++){
            t = (t * 10 + 1) % k;
            if(t == 0) return i;
        }
        return -1;
    }
}