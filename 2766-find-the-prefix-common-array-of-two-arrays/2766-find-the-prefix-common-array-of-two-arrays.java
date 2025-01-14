class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] t = new int[51];
        int n = A.length, cnt = 0;
        int[] output = new int[n];

        for(int i = 0; i < n; i++){
            if (++t[A[i]] == 2) cnt++;
            if (++t[B[i]] == 2) cnt++;
            output[i] = cnt;
        }
        return output;
    }
}