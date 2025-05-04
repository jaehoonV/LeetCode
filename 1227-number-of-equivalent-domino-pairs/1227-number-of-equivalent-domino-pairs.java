class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100];
        for(int[] d : dominoes){
            if (d[0] > d[1]) map[d[0] * 10 + d[1]]++;
            else map[d[1] * 10 + d[0]]++;
        }

        int output = 0;
        for(int m : map){
            output += (m - 1) * m / 2;
        }
        
        return output;
    }
}