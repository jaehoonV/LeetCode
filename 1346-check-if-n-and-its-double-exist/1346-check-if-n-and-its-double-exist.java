class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j] * 2 && i != j) return true;
            }    
        }
        return false;
    }
}