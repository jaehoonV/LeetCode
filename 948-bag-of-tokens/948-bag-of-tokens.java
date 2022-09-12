class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int output = 0;
        int temp = 0;
        int i = 0;
        int j = tokens.length - 1;
        
        while(i <= j){
            if(power >= tokens[i]){
                power -= tokens[i++];
                output = Math.max(output, ++temp);
            }else if(temp > 0){
                power += tokens[j--];
                temp--;
            }else{
                break;
            }
        }
        return output;
    }
}