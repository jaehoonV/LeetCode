class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int output = 0;
        
        for(int i = 0; i < n; i++){
            int a = rating[i];
            
            for(int j = i + 1; j < n; j++){
                int b = rating[j];
                boolean bool = false;
                if(a < b) bool = true;
                
                for(int k = j + 1; k < n; k++){
                    int c = rating[k];
                    if(bool && b < c) output++;
                    if(!bool && b > c) output++;
                }
            }
        }
        return output;
    }
}