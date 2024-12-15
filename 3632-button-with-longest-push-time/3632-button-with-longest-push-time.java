class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max_i = 0;
        int max_t = 0;
        int temp_t = 0;
        for(int[] e : events){
            int a = e[1] - temp_t;
            if(max_t < a){
                max_i = e[0];
                max_t = a;
            }else if(max_t == a){
                max_i = Math.min(max_i, e[0]);
            }
            temp_t = e[1];
        }
        return max_i;
    }
}