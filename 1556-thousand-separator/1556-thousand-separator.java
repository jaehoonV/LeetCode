class Solution {
    public String thousandSeparator(int n) {
        
        if(n == 0) return "0";
        
        int i = 1;
        String str = "";
        while(n != 0){
            str += n%10;
            n /= 10;
            
            if(i % 3 == 0 && n != 0){
                str += ".";
            }
            i++;
        }
        return new StringBuffer(str).reverse().toString();
    }
}