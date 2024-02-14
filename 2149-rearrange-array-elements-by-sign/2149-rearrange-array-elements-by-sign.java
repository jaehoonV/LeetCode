class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int n : nums){
            if(n >= 0) arr1.add(n);
            else arr2.add(n);
        }
        int n = nums.length;
        int[] output = new int[n];
        int c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            if (i % 2 == 0) temp = arr1.get(c1++);
            else temp = arr2.get(c2++);
            
            output[i] = temp;
        }
        return output;
    }
}