class Solution {
    int temp[];
    int leng = 0;
    public int countMaxOrSubsets(int[] nums) {
        int output = 0;
        leng = nums.length;
        temp = nums;
        for(int n : nums) output |= n;
        
        return func(0, 0, output);
    }

    public int func(int i, int j, int output){
        if(i == leng) return j == output ? 1 : 0;
        int a = func(i + 1, j | temp[i], output);
        int b = func(i + 1, j, output);
        return a + b;
    }
}