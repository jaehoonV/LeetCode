class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < k / 2; i++) {
            char c = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = c;
        }
        
        return new String(arr);
    }
}