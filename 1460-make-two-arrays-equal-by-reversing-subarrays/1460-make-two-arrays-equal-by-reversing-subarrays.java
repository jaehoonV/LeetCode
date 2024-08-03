class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] temp = new int[1001];
        
        for(int n : target) temp[n]++;
        for(int n : arr) temp[n]--;
        for(int i = 0; i <= 1000; i++){
            if(temp[i] != 0) return false;
        }
        return true;
    }
}