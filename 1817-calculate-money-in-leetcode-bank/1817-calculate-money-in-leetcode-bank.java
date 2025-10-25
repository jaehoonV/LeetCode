class Solution {
    public int totalMoney(int n) {
        int i = 1, j = 2;
        int output = 0;
        int cnt = 0;
        while(n > 0){
            n--;
            output += i;
            i++;
            cnt++;
            if(cnt >= 7){
                i = j;
                j++;
                cnt = 0;
            }
        }
        return output;
    }
}