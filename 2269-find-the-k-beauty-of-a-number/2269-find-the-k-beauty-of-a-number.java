class Solution {
    public int divisorSubstrings(int num, int k) {
        int i = 0;
        int output = 0;
        String s = Integer.toString(num);
        while(i <= s.length() - k){
            int temp = Integer.parseInt(s.substring(i, i + k));
            
            if(temp != 0 && num % temp == 0) output++;
            i++;
        }
        return output;
    }
}