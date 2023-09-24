class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        String output = "";
        
        for(char a : s.toCharArray()){
            if(a == '1'){
                output = "1" + output;
            }else{
                output += "0";
            }
        }
        return output.substring(1) + "1"; 
    }
}