class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int cnt = 1;
        int t = arr[0];
        for(int i = 1; i < n; i++){
            if(t == arr[i]){
                cnt++;
            }else{
                cnt = 1;
                t = arr[i];
            }
            
            if(cnt > n / 4) return t;
        }
        
        return t;
    }
}