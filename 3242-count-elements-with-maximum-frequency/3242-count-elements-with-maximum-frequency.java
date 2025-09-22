class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] a = new int[101];
        int output = 0;
        for(int n : nums) a[n]++;
        
        Arrays.sort(a);
        int b = a[100];
        for(int i = 100; i >= 0; i--) {
            if(a[i] == b) output += a[i];
            else break;
        }
        
        return output;
    }
}