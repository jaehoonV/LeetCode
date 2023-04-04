class Solution {
    int output = 0;
    public int findTheLongestBalancedSubstring(String s) {
        int temp = s.charAt(0) - '0';
        
        for(int i = 1; i < s.length(); i++){
            if(temp == 0 && s.charAt(i) == '1'){
                func(i, s);
            }
            temp = s.charAt(i) - '0';
        }
        
        return output;
    }
    
    public void func(int i, String s){
        int a = i;
        int b = i - 1;
        int cnt = 0;
        
        while(0 <= b && a < s.length()){
            if(s.charAt(b) == '0' && s.charAt(a) == '1'){
                cnt++;
                b--;
                a++;
            }else{
                break;
            }
        }
        output = Math.max(output, cnt * 2);
    }
}