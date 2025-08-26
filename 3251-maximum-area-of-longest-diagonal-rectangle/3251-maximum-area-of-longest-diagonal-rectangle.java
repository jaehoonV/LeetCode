class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0, output = 0;
        for(int[] d : dimensions) {
            int w = d[0], h = d[1], x = w * w + h * h, temp = w * h;
            if(x > max || (x == max && temp > output)) {
                max = x;
                output = temp;
            }
        }
        return output;
    }
}