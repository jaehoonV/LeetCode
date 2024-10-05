class Solution {
    public int minElement(int[] nums) {
        int output = Integer.MAX_VALUE;
        for (int num : nums) {
            output = Math.min(output, sum(num));
        }
        return output;
    }
    
    public int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}



    