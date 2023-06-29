class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        
        arr[0] = num/1000;
        num %= 1000;
        arr[1] = num/100;
        num %= 100;
        arr[2] = num/10;
        arr[3] = num %= 10;
        
        Arrays.sort(arr);
        
        return arr[0] * 10 + arr[1] * 10 + arr[2] + arr[3];
    }
}