class Solution {
    public int smallestNumber(int n) {
        int[] temp = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        for(int i = 0; i < 11; i++){
            if(n >= temp[i] && temp[i + 1] > n) return temp[i + 1] - 1;
        }
        return 1023;
    }
}