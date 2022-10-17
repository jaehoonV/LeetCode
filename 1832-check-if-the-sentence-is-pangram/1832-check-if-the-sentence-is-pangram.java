class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int j = 0; j < 26; j++){
            if(arr[j] == 0) return false;
        }
        
        return true;
    }
}