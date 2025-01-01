class Solution {
    public int maxScore(String s) {
        int output = 0, o = 0, z = 0;
        char[] c_arr = s.toCharArray();
        for(char c : c_arr){
            if(c == '1') o++;
        }

        for(int i = 0; i < c_arr.length - 1; i++){
            if(c_arr[i] == '0') z++;
            else o--;
            output = Math.max(output, o + z);
        }

        return output;
    }
}