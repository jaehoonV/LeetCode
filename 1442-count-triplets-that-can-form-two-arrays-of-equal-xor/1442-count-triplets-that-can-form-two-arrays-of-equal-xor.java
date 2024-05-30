class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length, output = 0;
        for(int i = 0; i < n; i++){
            long temp = arr[i];
            for(int j = i + 1; j < n; j++){
                long t = arr[j];
                temp ^= t;
                if(temp == 0) output += (j - i);
            }
        }
        return output;
    }
}