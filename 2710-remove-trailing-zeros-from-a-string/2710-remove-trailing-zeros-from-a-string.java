class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int a = n;
        
        for(int i = n - 1; i >= 0; i--){
            if(num.charAt(i) != '0'){
                return num.substring(0, a);
            } else{
                a = i;
            }
        }
        return num;
    }
}