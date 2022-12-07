class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = arr[0];
        int temp = arr[0];
        int a = 0;
        int n = arr.length;

        for(int i = 1; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
                a = i;
            } else if(max == arr[i]) return false;
        }
        if(a == 0 || a == n - 1) return false;

        for(int i = 1; i < n; i++){
            if(i <= a){
                if(temp >= arr[i]) return false;
            } else{
                if(temp <= arr[i]) return false;
            }
            temp = arr[i];
        }

        return true;
    }
}