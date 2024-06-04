class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        int output = 0;
        
        for(char c : s.toCharArray()){
            arr[c]++;
            if(arr[c] % 2 == 0) output += 2;
        }
        
        return output < s.length() ? output + 1 : output;
        
    }
}