class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int c = 0;
        while(i >= 0 || j >= 0 || c != 0){
            int temp = c;
            if(i >= 0){
               temp += num1.charAt(i--) - '0'; 
            }
            if(j >= 0){
               temp += num2.charAt(j--) - '0'; 
            }
            sb.append(temp % 10);
            c = temp / 10;
        }
        return sb.reverse().toString();
    }
}