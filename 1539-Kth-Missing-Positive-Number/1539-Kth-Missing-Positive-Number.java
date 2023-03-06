class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 1;
        int j = 0;
        int cnt = 0;
        int output = 0;
        while(true){
            if(j < arr.length && i == arr[j]){
                j++;
            }else{
                cnt++;
            }
            if(k == cnt) {
                output = i;
                break;
            }
            i++;
        }
        return output;
    }
}