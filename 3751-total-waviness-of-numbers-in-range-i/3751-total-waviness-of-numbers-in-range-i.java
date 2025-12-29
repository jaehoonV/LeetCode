class Solution {
    public int totalWaviness(int num1, int num2) {
        int output = 0;

        for(int i = num1; i <= num2; i++){
            output += func(i);
        }
        return output;
    }

    public int func(int a){
        String s = Integer.toString(a);
        int l = s.length();
        if(l < 2) return 0;

        int cnt = 0;

        for(int i = 0; i < l - 2; i++){
            int s_1 = s.charAt(i) - '0';
            int s_2 = s.charAt(i + 1) - '0';
            int s_3 = s.charAt(i + 2) - '0';
            if((s_1 < s_2 && s_2 > s_3) || (s_1 > s_2 && s_2 < s_3)){
                cnt++;
            }
        }
        return cnt;
    }
}