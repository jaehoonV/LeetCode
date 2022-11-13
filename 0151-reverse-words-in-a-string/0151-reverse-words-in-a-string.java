class Solution {
    public String reverseWords(String s) {
        String output = "";
        
        String[] arr = s.trim().split("\\s+");
        
        for (int i = arr.length - 1; i >= 0; i--) {
            output += arr[i];
            if(i != 0) output += " ";
        } 
        
        return output;
    }
}