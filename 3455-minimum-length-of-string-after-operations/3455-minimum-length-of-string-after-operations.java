class Solution {
    public int minimumLength(String s) {
        int[] arr = new int[26];
        int output = 0;
        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] == 0) continue;
            output += (arr[i] % 2 == 0) ? 2 : 1;
        }        

        return output;
    }
}