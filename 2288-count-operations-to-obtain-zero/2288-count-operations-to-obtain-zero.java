class Solution {
    public int countOperations(int num1, int num2) {
        int output = 0;

        while(num1 != 0 && num2 != 0){
            output += num1 / num2;
            num1 %= num2;
            int t = num1;
            num1 = num2;
            num2 = t;
        }

        return output;
    }
}