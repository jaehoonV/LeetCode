class Solution {
    public int numberOfBeams(String[] bank) {
        int output = 0;
        int temp = func(bank[0]);
        for(int i = 1; i < bank.length; i++){
            int n = func(bank[i]);
            if(n != 0){
                output += (temp * n);
                temp = n;
            }
        }
        return output;
    }
    
    public int func(String s){
        int output = 0;
        for(char c : s.toCharArray()){
            if(c == '1') output++;
        }
        return output;
    }
}