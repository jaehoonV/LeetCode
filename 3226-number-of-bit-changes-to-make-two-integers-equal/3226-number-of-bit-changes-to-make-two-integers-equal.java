class Solution {
    public int minChanges(int n, int k) {
        if(n < k) return -1;
        int output = 0;
        String n_binary = Integer.toBinaryString(n);
        String k_binary = Integer.toBinaryString(k);
        
        int i = n_binary.length() - 1;
        int j = k_binary.length() - 1;
        while(true){
            if(i < 0) break;
            if(j >= 0){
                char n_c = n_binary.charAt(i);
                char k_c = k_binary.charAt(j);
                
                if(n_c == '0' && k_c == '1') return -1;
                if(n_c == '1' && k_c == '0') output++;
            }else{
                char n_c = n_binary.charAt(i);
                if(n_c == '1') output++;
            }
            i--;
            j--;
        }
        return output;
    }
}