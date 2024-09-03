class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int output = 0;
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            sb.append(((int)(s.charAt(i)) - 96));
        }
        
        for(int i = 0; i < sb.length(); i++){
            output += ((sb.charAt(i))-'0');
        }
        
        k--;
        
        while(k > 0){
            int temp = output;
            output = 0;
            while(temp > 0){
                int a = temp % 10;
                temp /= 10;
                output += a;
            }
            k--;
        }
        
        return output;
    }
}