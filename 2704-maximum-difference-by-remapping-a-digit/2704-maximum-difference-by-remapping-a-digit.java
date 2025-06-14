class Solution {
    public int minMaxDifference(int num) {
        char max[] = String.valueOf(num).toCharArray();
        char min[] = String.valueOf(num).toCharArray();
        char a = max[0], b = min[0];
        int n = max.length;

        for(int i = 0; i < n; i++){
            if(max[i] != '9'){
                a = max[i];
                break;
            }
        }

        for(int i = 0; i < n; i++){
            if(max[i] == a) max[i] = '9';
        }

        for(int i = 0; i < n; i++){
            if(min[i] == b) min[i] = '0';
        }

        return Integer.parseInt(String.valueOf(max)) - Integer.parseInt(String.valueOf(min));
    }
}