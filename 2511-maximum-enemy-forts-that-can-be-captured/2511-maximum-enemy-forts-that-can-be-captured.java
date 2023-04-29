class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int n = forts.length;
        int temp = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(forts[i] != 0 && (temp + forts[i]) == 0) {
                max = Math.max(max, cnt);
                temp = forts[i];
                cnt = 0;
            }else if(forts[i] != 0 && (temp + forts[i]) != 0){
                temp = forts[i];
                cnt = 0;
            }else if(forts[i] == 0){
                cnt++;
            }
        }
        return max;
    }
}