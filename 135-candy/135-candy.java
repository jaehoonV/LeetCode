class Solution {
    public int candy(int[] ratings) {
        int output = 0;
        int n = ratings.length;
        
        // 순서대로
        int[] tempA = new int[n];
        Arrays.fill(tempA,1);       
        for(int i = 1; i < n; i++){
            if(ratings[i - 1] < ratings[i]){
                tempA[i] = tempA[i - 1] + 1;
            }
        }
        
        // 역순
        int[] tempB = new int[n];
        Arrays.fill(tempB,1);       
        for(int j = n - 2; j >= 0; j--){
            if(ratings[j + 1] < ratings[j]){
                tempB[j] = tempB[j + 1] + 1;
            }
        }
        
        // 더 큰값을 더 함
        for(int k = 0; k < n; k++){
            output += Math.max(tempA[k], tempB[k]);
        }
        
        return output;
    }
}