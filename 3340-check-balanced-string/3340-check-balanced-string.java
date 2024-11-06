class Solution {
    public boolean isBalanced(String num) {
        boolean b = true;
        int i = 0, output = 0, n = num.length();
        while(i < n){
            int t = num.charAt(i) - '0';
            if(b){
                output += t;
                b = false;
            }else{
                output -= t;
                b = true;
            }
            i++;
        }
        return output == 0;
        
    }
}