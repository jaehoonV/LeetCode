class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i = 0, j = 0, cnt = 0;
        int output = Integer.MAX_VALUE;

        while(i < blocks.length()){
            if(blocks.charAt(i) == 'W') cnt++;
            if(i - j + 1 == k){
                output = Math.min(cnt, output);
                if(blocks.charAt(j) == 'W') cnt--;
                j++;
            }
             i++;
        }
        
        return output;
    }
}