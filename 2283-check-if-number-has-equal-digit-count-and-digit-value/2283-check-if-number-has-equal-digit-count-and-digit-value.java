class Solution {
    public boolean digitCount(String num) {
        char[] arr = num.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0 ; j < n; j++){
                if(i == arr[j] - '0'){
                    cnt++;
                }
            }
            if(cnt != arr[i] - '0') return false;
        }
        return true;
    }
}