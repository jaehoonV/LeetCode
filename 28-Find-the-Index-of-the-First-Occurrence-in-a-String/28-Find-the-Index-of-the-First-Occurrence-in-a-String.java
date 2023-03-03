class Solution {
    public int strStr(String h, String n) {
        int h_l = h.length();
        int n_l = n.length();
        if(h_l < n_l) return -1;
        int output = -1;
        loop1:
        for(int i = 0; i < h_l; i++){
            int j = i;
            int k = 0;
            if(h.charAt(j) == n.charAt(k)){
                output = i;
                loop2:
                while(j < h_l && k < n_l){
                    if(h.charAt(j) == n.charAt(k)){
                        j++;
                        k++;
                    }else{
                        output = -1;
                        continue loop1;
                    }

                    if(k == n_l&& output != -1) break loop1;
                }
                output = -1;
            }
        }
        return output;
    }
}