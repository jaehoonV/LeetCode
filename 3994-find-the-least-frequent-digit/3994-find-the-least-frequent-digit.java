class Solution {
    public int getLeastFrequentDigit(int n) {
        int cnt[] = new int[10];
        while(n != 0){
            int a = n % 10;
            cnt[a]++;
            n /= 10;
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 10 ; i++){
            if(cnt[i] > 0) min = Math.min(min, cnt[i]);
        }

        for(int i = 0; i < 10; i++){
            if (min == cnt[i]) return i;
        }
        
        return -1;
    }
}