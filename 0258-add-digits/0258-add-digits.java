class Solution {
    public int addDigits(int num) {
        if(num / 10 == 0) return num;
        int n = 0;
        while(true){
            n += num % 10;
            num /= 10;
            if(num == 0) break;
        }
        return addDigits(n);
    }
}