class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int temp[] = new int[101];
        int output = 0;

        for(int n : nums) temp[n]++;

        for(int i = 0; i <= 100; i++){
            int a = temp[i];
            if(a != 0 && a % k == 0){
                output += i * a;
            }
        }
        return output;
    }
}