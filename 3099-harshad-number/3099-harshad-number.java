class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int output = 0;
        int temp = x;
        while(x > 0){
            output += (x % 10);
            x /= 10;
        }
        
        return temp % output == 0 ? output : -1;
    }
}