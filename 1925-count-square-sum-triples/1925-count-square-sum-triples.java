class Solution {
    public int countTriples(int n) {
        int output = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int temp = i * i + j * j;
                int t = (int) Math.sqrt(temp);

                if(t * t == temp && t <= n) output++;
            }
        }

        return output;
    }
}