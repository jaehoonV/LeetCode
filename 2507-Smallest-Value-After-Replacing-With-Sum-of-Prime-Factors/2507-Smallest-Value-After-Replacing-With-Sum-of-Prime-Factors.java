class Solution {
    public int smallestValue(int n) {
        int n1 = n;
        int cnt = 0;
        int temp = 0;
        int i = 2;
        while (n != 1) {
            if (n % i == 0) {
                cnt++;
                temp += i;
                n /= i;
            } else {
                i++;
            }
        }
        
        if(cnt <= 1 || temp == n1) return temp;
        
        return smallestValue(temp);
    }

}