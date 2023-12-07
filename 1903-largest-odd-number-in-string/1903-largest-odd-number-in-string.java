class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int i = n - 1;
        
        if((int)num.charAt(i) % 2 == 1) return num;
        
        while(i >= 0){
            if(num.charAt(i) % 2 == 1) return num.substring(0, i + 1);
            i--;
        }
        return "";
    }
}