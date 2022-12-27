class Solution {
    public int maximumBags(int[] c, int[] r, int a) {
        int n = c.length;
        int[] temp = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            temp[i] = c[i] - r[i];
        }
        Arrays.sort(temp);
        for(int i = 0; i < n; i++){
            if(temp[i] == 0) {
                cnt++;
            } else{
                if(a >= temp[i]){
                    a -= temp[i];
                    cnt++;
                } else{
                    break;
                }
            }
        }
        return cnt;
    }
}