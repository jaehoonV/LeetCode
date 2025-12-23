class Solution {
    public int[] sortByReflection(int[] nums) {
        int n = nums.length;
        int output[] = new int[n];
        int temp[][] = new int[n][2];

        for(int i = 0; i < n; i++){
            String s = Integer.toBinaryString(nums[i]);
            String sr = new StringBuilder(s).reverse().toString();
            int a = Integer.parseInt(sr, 2);
            
            temp[i][0] = a; 
            temp[i][1] = nums[i];
        }
        
        Arrays.sort(temp, (a, b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for(int i = 0; i < n; i++){
            output[i] = temp[i][1];
        }
        return output;
    }
}